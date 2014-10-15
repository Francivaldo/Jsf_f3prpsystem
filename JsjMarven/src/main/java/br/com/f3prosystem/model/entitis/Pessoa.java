package br.com.f3prosystem.model.entitis;

import com.sun.istack.internal.Nullable;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javassist.SerialVersionUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author f3prosystem
 */
@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable{
private static final long SerialVersionUID=1L;
    @Id
    @GeneratedValue
    @Column(name = "IdPessoa", nullable = false)
    private Integer idPesoa;
    
    @Column(name = "Nome", nullable = false, length = 80)
    private String nome;
    
    @Column(name = "Email", nullable = false, length = 80)
    private String email;
    
    @Column(name = "Telefone", nullable = false, length = 15)
    private String telefone;
    
    @Column(name = "CPF", nullable = false, length = 14)
    private String cpf;
    
  @Column(name="DataDeNascimento", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDeNascimento;
  
    @Column(name="DataDeCadastro", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataDeCadastro;
    @ManyToOne (optional = false)
    @JoinColumn(name = "PessoaSexo")
    private Pessoa pessoa;

    public Pessoa() {
    }

    public Integer getIdPesoa() {
        return idPesoa;
    }

    public void setIdPesoa(Integer idPesoa) {
        this.idPesoa = idPesoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Date getDataDeCadastro() {
        return DataDeCadastro;
    }

    public void setDataDeCadastro(Date DataDeCadastro) {
        this.DataDeCadastro = DataDeCadastro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idPesoa);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.idPesoa, other.idPesoa)) {
            return false;
        }
        return true;
    }

}
