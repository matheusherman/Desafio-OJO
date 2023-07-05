package ojo.teste.compras.repository

import ojo.teste.compras.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository : JpaRepository<Cliente, Long>
