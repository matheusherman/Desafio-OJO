package ojo.teste.compras.service

import ojo.teste.compras.model.Produto
import ojo.teste.compras.repository.ProdutoRepository
import org.springframework.stereotype.Service

@Service
class ProdutoService(private val produtoRepository: ProdutoRepository) {

    fun criarProduto(produto: Produto): Produto {
        return produtoRepository.save(produto)
    }

    fun buscarProdutoPorId(id: Long): Produto? {
        return produtoRepository.findById(id).orElse(null)
    }

    fun listarProdutos(): List<Produto> {
        return produtoRepository.findAll()
    }

}
