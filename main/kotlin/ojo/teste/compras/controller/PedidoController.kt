package ojo.teste.compras.controller

import ojo.teste.compras.model.EntregaRequest
import ojo.teste.compras.model.EntregaResponse
import ojo.teste.compras.model.Pedido
import ojo.teste.compras.service.PedidoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping("/pedidos")
class PedidoController(private val pedidoService: PedidoService, private val restTemplate: RestTemplate) {

    @PostMapping
    fun criarPedido(@RequestBody pedido: Pedido): ResponseEntity<Pedido> {
        val novoPedido = pedidoService.criarPedido(pedido)

        // Criar ordem de entrega no microservice de entregas
        val entregaRequest = EntregaRequest(novoPedido.id)
        val entregaUrl = "http://localhost:8081/entregas" // Atualize a URL de acordo com o serviço de entregas
        val entregaResponse = restTemplate.postForObject(entregaUrl, entregaRequest, EntregaResponse::class.java)

        if (entregaResponse != null && entregaResponse.status == "SUCCESS") {
            return ResponseEntity.status(HttpStatus.CREATED).body(novoPedido)
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(novoPedido)
    }

    @GetMapping("/{id}")
    fun buscarPedidoPorId(@PathVariable id: Long): ResponseEntity<Pedido?> {
        val pedido = pedidoService.buscarPedidoPorId(id)
        return if (pedido != null) {
            ResponseEntity.ok(pedido)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @GetMapping
    fun listarPedidos(): ResponseEntity<List<Pedido>> {
        val pedidos = pedidoService.listarPedidos()
        return ResponseEntity.ok(pedidos)
    }
}
