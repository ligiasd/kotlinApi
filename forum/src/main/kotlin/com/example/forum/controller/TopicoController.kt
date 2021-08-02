package com.example.forum.controller

import com.example.forum.model.Curso
import com.example.forum.model.Topico
import com.example.forum.model.Usuario
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController {

    @GetMapping
    fun listar(): List<Topico>{
        val topico = Topico(
            id = 1,
            titulo = "Duvida Kotlin",
            mensagem = "Variaves Kotlin",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categorias = "Programador"
            ),
            autor = Usuario(
                id = 1,
                nome = "Jose Silva",
                email = "jose@email.com"

            )

        )
        return Arrays.asList(topico, topico, topico)
    }
}