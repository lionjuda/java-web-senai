package org.example.servicos;

import org.example.entidades.Produto;
import org.example.repositorios.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    public ProdutoRepository produtoRepository;

    public List<Produto> findAll () {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id){
        return produtoRepository.findById(id);
    }

    public Produto inserir(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto atualizar(Long id, Produto produtoAtualizado){
        return produtoRepository.findById(id).map(produto -> {
            produto.setNome(produtoAtualizado.getNome());
            produto.setPreco(produtoAtualizado.getPreco());
            produto.setFornecedor(produtoAtualizado.getFornecedor());
            return produtoRepository.save(produto);
        }).orElseThrow(() -> new RuntimeException("Produto não encontrado com ID: " + id));
    }

    public void deleteId(Long id){
        produtoRepository.deleteById(id);
    }

}