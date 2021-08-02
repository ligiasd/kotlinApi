package com.example.forum.service

import com.example.forum.model.Curso
import com.example.forum.model.Topico
import com.example.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService {
    fun listar(): List<Topico> {
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
