package ojo.teste.compras.controller

import ojo.teste.compras.model.Produto
import ojo.teste.compras.service.ProdutoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/produtos")
class ProdutoController(private val produtoService: ProdutoService) {

    @PostMapping
    fun criarProduto(@RequestBody produto: Produto): ResponseEntity<Produto> {
        val novoProduto = produtoService.criarProduto(produto)
        return ResponseEntity.status(HttpStatus.CREATED).body(novoProduto)
    }

    @GetMapping("/{id}")
    fun buscarProdutoPorId(@PathVariable id: Long): ResponseEntity<Produto?> {
        val produto = produtoService.buscarProdutoPorId(id)
        return if (produto != null) {
            ResponseEntity.ok(produto)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @GetMapping
    fun listarProdutos(): ResponseEntity<List<Produto>> {
        val produtos = produtoService.listarProdutos()
        return ResponseEntity.ok(produtos)
    }

}
