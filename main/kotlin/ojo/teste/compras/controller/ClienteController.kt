package ojo.teste.compras.controller

import ojo.teste.compras.model.Cliente
import ojo.teste.compras.service.ClienteService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/clientes")
class ClienteController(private val clienteService: ClienteService) {

    @PostMapping
    fun criarCliente(@RequestBody cliente: Cliente): ResponseEntity<Cliente> {
        val novoCliente = clienteService.criarCliente(cliente)
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente)
    }

    @GetMapping("/{id}")
    fun buscarClientePorId(@PathVariable id: Long): ResponseEntity<Cliente?> {
        val cliente = clienteService.buscarClientePorId(id)
        return if (cliente != null) {
            ResponseEntity.ok(cliente)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @GetMapping
    fun listarClientes(): ResponseEntity<List<Cliente>> {
        val clientes = clienteService.listarClientes()
        return ResponseEntity.ok(clientes)
    }

}
