package org.example.entidades;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.*;
import javax.persistence.*;


@Entity
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTATO")
    private Long idContato;

    @Column(name = "NOME_CONTATO")
    private String nomeContato;

    @Column(name = "TELEFONE")
    private String telefone;

    public Contato(){

    }

    public Contato(Long idContato, String nomeContato, String telefone) {
        this.idContato = idContato;
        this.nomeContato = nomeContato;
        this.telefone = telefone;
    }

    public Long getIdContato() {
        return idContato;
    }

    public void setIdContato(Long idContato) {
        this.idContato = idContato;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}

