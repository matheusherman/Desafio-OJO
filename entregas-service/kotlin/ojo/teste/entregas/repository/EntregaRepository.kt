package ojo.teste.entregas.repository

import ojo.teste.entregas.model.Entrega
import org.springframework.data.jpa.repository.JpaRepository

interface EntregaRepository : JpaRepository<Entrega, Long>
