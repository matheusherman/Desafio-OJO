package ojo.teste.entregas.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "entregas")
data class Entrega(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @Column(name = "pedido_id")
        val pedidoId: Long,

        @Column(name = "endereco_id")
        val enderecoId: Long,

        val status: String,

        @Column(name = "data_entrega")
        val dataEntrega: LocalDateTime?
)
