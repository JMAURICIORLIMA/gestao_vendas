package com.vendas.gestao_vendas.repositorio;

import com.vendas.gestao_vendas.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepositorio extends JpaRepository<Produto>, Long> {

        Produtos findByNome(String nome);
}
