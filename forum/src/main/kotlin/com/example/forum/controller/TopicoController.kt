package com.example.forum.controller

import com.example.forum.model.Curso
import com.example.forum.model.Topico
import com.example.forum.model.Usuario
import com.example.forum.service.TopicoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController (private val service: TopicoService){
    @GetMapping
    fun listar(): List<Topico> {
        return service.listar()
    }
}