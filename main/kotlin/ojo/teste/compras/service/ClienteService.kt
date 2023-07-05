package ojo.teste.compras.service

import ojo.teste.compras.model.Cliente
import ojo.teste.compras.repository.ClienteRepository
import org.springframework.stereotype.Service

@Service
class ClienteService(private val clienteRepository: ClienteRepository) {

    fun criarCliente(cliente: Cliente): Cliente {
        return clienteRepository.save(cliente)
    }

    fun buscarClientePorId(id: Long): Cliente? {
        return clienteRepository.findById(id).orElse(null)
    }

    fun listarClientes(): List<Cliente> {
        return clienteRepository.findAll()
    }

}
