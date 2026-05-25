package io.github.ericlima1993.icompras.clientes.repository;

import io.github.ericlima1993.icompras.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
