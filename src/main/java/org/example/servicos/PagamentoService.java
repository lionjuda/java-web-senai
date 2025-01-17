package org.example.servicos;

import org.example.entidades.Pagamento;
import org.example.repositorios.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    public PagamentoRepository pagamentoRepository;

    public List<Pagamento> findAll () {
        return pagamentoRepository.findAll();
    }

    public Optional<Pagamento> buscarPorId(Long id){
        return pagamentoRepository.findById(id);
    }

    public Pagamento inserir(Pagamento pagamento){
        return pagamentoRepository.save(pagamento);
    }

    public void deleteId(Long id){
        pagamentoRepository.deleteById(id);
    }

}
