package org.example.servicos;

import org.example.entidades.Fornecedor;
import org.example.repositorios.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    public FornecedorRepository fornecedorRepository;

    public List<Fornecedor> findAll () {
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> buscarPorId(Long id){
        return fornecedorRepository.findById(id);
    }

    public Fornecedor inserir(Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
    }

    public void deleteId(Long id){
        fornecedorRepository.deleteById(id);
    }

}
