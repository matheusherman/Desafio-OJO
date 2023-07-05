package ojo.teste.entregas.controller

import ojo.teste.entregas.model.Entrega
import ojo.teste.entregas.service.EntregaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/entregas")
class EntregaController(private val entregaService: EntregaService) {

    @PostMapping
    fun criarEntrega(@RequestBody entrega: Entrega): ResponseEntity<Entrega> {
        val novaEntrega = entregaService.criarEntrega(entrega)
        return ResponseEntity.status(HttpStatus.CREATED).body(novaEntrega)
    }

    @GetMapping("/{id}")
    fun buscarEntregaPorId(@PathVariable id: Long): ResponseEntity<Entrega?> {
        val entrega = entregaService.buscarEntregaPorId(id)
        return if (entrega != null) {
            ResponseEntity.ok(entrega)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @GetMapping
    fun listarEntregas(): ResponseEntity<List<Entrega>> {
        val entregas = entregaService.listarEntregas()
        return ResponseEntity.ok(entregas)
    }

}
