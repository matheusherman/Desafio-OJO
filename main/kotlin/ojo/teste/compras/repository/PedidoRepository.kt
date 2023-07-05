package ojo.teste.compras.repository

import ojo.teste.compras.model.Pedido
import org.springframework.data.jpa.repository.JpaRepository

interface PedidoRepository : JpaRepository<Pedido, Long>
