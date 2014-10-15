
package br.com.f3prosystem.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import org.hibernate.Session;


public class PhaseListener implements javax.faces.event.PhaseListener{
// Antes  de fase
    @Override
    public void afterPhase(PhaseEvent fase) {
        if(fase.getPhaseId().equals(PhaseId.RESTORE_VIEW)){
            System.out.println("antes de fase:"+getPhaseId());
            Session session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            FacesContextUtil.setRequestSession(session);
            
        }
      
    }
// depois da Fase
    @Override
    public void beforePhase(PhaseEvent fase) {
          System.out.println("depois da fase");
       if(fase.getPhaseId().equals(PhaseId.RENDER_RESPONSE)){
         
           Session session=FacesContextUtil.getRequestSession();
           try {
               session.getTransaction().commit();
           } catch (Exception e) {
               if(session.getTransaction().isActive()){
                   session.getTransaction().rollback();
               }
               
           }
           finally{
               session.close();
           }
           
       }
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
               
       
    }
    
}
