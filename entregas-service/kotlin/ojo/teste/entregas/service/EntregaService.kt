package ojo.teste.entregas.service

import ojo.teste.entregas.model.Entrega
import ojo.teste.entregas.repository.EntregaRepository
import org.springframework.stereotype.Service

@Service
class EntregaService(private val entregaRepository: EntregaRepository) {

    fun criarEntrega(entrega: Entrega): Entrega {
        return entregaRepository.save(entrega)
    }

    fun buscarEntregaPorId(id: Long): Entrega? {
        return entregaRepository.findById(id).orElse(null)
    }

    fun listarEntregas(): List<Entrega> {
        return entregaRepository.findAll()
    }

}
