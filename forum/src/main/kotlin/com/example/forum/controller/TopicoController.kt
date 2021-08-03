package com.example.forum.controller

import com.example.forum.dto.NovoTopicoDto
import com.example.forum.model.Curso
import com.example.forum.model.Topico
import com.example.forum.model.Usuario
import com.example.forum.service.TopicoService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController (private val service: TopicoService){
    @GetMapping
    fun listar(): List<Topico> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Topico{
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody topico: NovoTopicoDto){
        service.cadastrar(topico)

    }

}