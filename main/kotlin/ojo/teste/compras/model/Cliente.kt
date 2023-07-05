package ojo.teste.compras.model

import jakarta.persistence.*

@Entity
@Table(name = "clientes")
data class Cliente(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        val nome: String,

        val email: String,

        val telefone: String
)
