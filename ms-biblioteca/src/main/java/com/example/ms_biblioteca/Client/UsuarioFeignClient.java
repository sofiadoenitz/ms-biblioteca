package com.example.ms_biblioteca.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ms_biblioteca.Model.DTO.UsuarioDTO;

@FeignClient(
    name = "ms-usuario",
    url = "http://localhost:8080"
)
public interface UsuarioFeignClient {
    @GetMapping("/api/v1/usuario/{id}")
    UsuarioDTO obtenerUsuario(@PathVariable Long id);

}
