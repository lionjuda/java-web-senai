package org.example.entidades;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.*;
import javax.persistence.*;


@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long idCliente;

    @ManyToOne
    @JoinColumn(name = "ID_CONTATO", nullable = false)
    private Contato contato;

    @Column(name = "NOME_CLIENTE")
    private String nomeCliente;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "CPF")
    private String cpf;

    public Cliente(){

    }

    public Cliente(Long idCliente, Contato contato, String nomeCliente, String telefone, String cpf) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;
        this.cpf = cpf;
        this.contato = contato;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf(){return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public Contato getContato() { return contato; }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
