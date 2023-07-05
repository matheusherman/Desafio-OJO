package ojo.teste.compras.repository

import ojo.teste.compras.model.Produto
import org.springframework.data.jpa.repository.JpaRepository

interface ProdutoRepository : JpaRepository<Produto, Long>
