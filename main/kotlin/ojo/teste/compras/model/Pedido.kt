package ojo.teste.compras.model

import java.time.LocalDateTime
import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "pedidos")
data class Pedido(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @Column(name = "cliente_id")
        val clienteId: Long,

        @Column(name = "data_pedido")
        val dataPedido: LocalDateTime,

        val total: BigDecimal
)
