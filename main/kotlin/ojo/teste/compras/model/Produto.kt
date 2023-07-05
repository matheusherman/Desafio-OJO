package ojo.teste.compras.model

import java.math.BigDecimal
import jakarta.persistence.*

@Entity
@Table(name = "produtos")
data class Produto(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        val nome: String,

        val preco: BigDecimal,

        val estoque: Int
)
