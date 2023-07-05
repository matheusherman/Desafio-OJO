package ojo.teste.compras.service

import ojo.teste.compras.model.Pedido
import ojo.teste.compras.repository.PedidoRepository
import org.springframework.stereotype.Service

@Service
class PedidoService(private val pedidoRepository: PedidoRepository) {

    fun criarPedido(pedido: Pedido): Pedido {
        return pedidoRepository.save(pedido)
    }

    fun buscarPedidoPorId(id: Long): Pedido? {
        return pedidoRepository.findById(id).orElse(null)
    }

    fun listarPedidos(): List<Pedido> {
        return pedidoRepository.findAll()
    }

}
