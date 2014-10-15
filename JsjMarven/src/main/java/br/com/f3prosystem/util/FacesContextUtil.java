
package br.com.f3prosystem.util;

import javax.faces.context.FacesContext;
import org.hibernate.Session;

//FAZENDO O CICLO DE VIDA MODO  VISAO
public class FacesContextUtil {
private static final String HIBERNATE_SESSION="hibernete_session"; 

public static void setRequestSession(Session session){
    FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put(HIBERNATE_SESSION, HIBERNATE_SESSION);
            
    
}
    public static Session getRequestSession() {
        return (Session)FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get(HIBERNATE_SESSION);
    }

    
    
}
