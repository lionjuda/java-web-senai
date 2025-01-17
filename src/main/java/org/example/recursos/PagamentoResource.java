package org.example.recursos;

import org.example.entidades.Pagamento;
import org.example.servicos.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoResource {

    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping
    public List<Pagamento> findAll(){
        return pagamentoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pagamento> findById(@PathVariable Long id){
        return pagamentoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Pagamento create (@RequestBody Pagamento pagamento){
        return pagamentoService.inserir(pagamento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pagamento> update(@PathVariable Long id, @RequestBody Pagamento pagamento){
        return pagamentoService.buscarPorId(id)
                .map(existingPagamento -> {
                    pagamento.setIdPagamento(existingPagamento.getIdPagamento());
                    return ResponseEntity.ok(pagamentoService.inserir(pagamento));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id){
        return pagamentoService.buscarPorId(id)
                .map(existingPagamento -> {
                    pagamentoService.deleteId(id);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }

}