package io.github.ericlima1993.icompras.clientes.controller;

import io.github.ericlima1993.icompras.clientes.model.Cliente;
import io.github.ericlima1993.icompras.clientes.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> inserirCliente(@RequestBody Cliente cliente){
        clienteService.salvar(cliente);
        return ResponseEntity.ok(cliente);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Cliente> obterPorCodigo(@PathVariable("codigo") Long codigo){
        return clienteService.obterPorCodigo(codigo).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
