package com.example.forum.service

import com.example.forum.model.Curso
import com.example.forum.model.Topico
import com.example.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(private var topicos: List<Topico>) {

    init {
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
        val topico2 = Topico(
            id = 2,
            titulo = "Duvida Kotlin",
            mensagem = "Variaves Kotlin",
            curso = Curso(
                id = 2,
                nome = "Kotlin",
                categorias = "Programador"
            ),
            autor = Usuario(
                id = 2,
                nome = "Jose Silva",
                email = "jose@email.com"

            )

        )
        val topico3 = Topico(
        id = 3,
        titulo = "Duvida Kotlin",
        mensagem = "Variaves Kotlin",
        curso = Curso(
            id = 3,
            nome = "Kotlin",
            categorias = "Programador"
        ),
        autor = Usuario(
            id = 3,
            nome = "Jose Silva",
            email = "jose@email.com"

        )

        )
        topicos = Arrays.asList(topico, topico2, topico3)
    }
    fun listar(): List<Topico> {
        return topicos

    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({
            t -> t.id == id
        }).findFirst().get()

    }

}
