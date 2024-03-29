
package br.com.f3prosystem.model.entitis;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sexo")
public class Sexo implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue
    @Column(name="IdSexo",nullable = false)
    private Integer idSexo;
    
    @Column(name="Descricao" ,unique = true,nullable = false, length = 9)
    private String descricao;
    @OneToMany(mappedBy = "sexo",fetch=FetchType.LAZY)
  @JoinColumn(name = "PessoaSexo")
    private List<Pessoa> pessoas;
    public Sexo() {
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idSexo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sexo other = (Sexo) obj;
        if (!Objects.equals(this.idSexo, other.idSexo)) {
            return false;
        }
        return true;
    }
    
    

    
    
}
