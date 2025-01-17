package org.example.entidades;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.*;
import javax.persistence.*;


@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAGAMENTO")
    private Long idPagamento;

    @Column(name = "TIPO_PAGAMENTO")
    private String tipoPagamento;

    @Column(name = "CARTAO")
    private String cartao;

    public Pagamento(){

    }

    public Pagamento(Long idPagamento, String cartao, String tipoPagamento) {
        this.idPagamento = idPagamento;
        this.tipoPagamento = tipoPagamento;
        this.cartao = cartao;
    }

    public Long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String gettipoPagamento() {
        return tipoPagamento;
    }

    public void settipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
}
