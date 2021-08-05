package com.example.forum.service

import com.example.forum.dto.NovoTopicoForm
import com.example.forum.dto.TopicoView
import com.example.forum.model.Topico
import org.springframework.stereotype.Service
import java.util.stream.Collectors
import kotlin.collections.ArrayList

@Service
class TopicoService(
    private var topicos: List<Topico> = ArrayList(),
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService


)
{

    fun listar(): List<TopicoView> {
        return topicos.stream().map { t -> TopicoView(
            id = t.id,
            titulo = t.titulo,
            mensagem = t.mensagem,
            dataCriacao = t.dataDescricao,
            status = t.status

        ) }.collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
        return TopicoView(
            id = topico.id,
            titulo = topico.titulo,
            mensagem = topico.mensagem,
            dataCriacao = topico.dataDescricao,
            status = topico.status

        )
    }

    fun cadastrar(dto: NovoTopicoForm) {
        topicos.plus(Topico(
            id = topicos.size.toLong() + 1,
            titulo =  dto.titulo,
            mensagem = dto.mensagem,
            curso = cursoService.buscarPorId(dto.idCurso),
            autor = usuarioService.buscarPorId(dto.idAutor)
        ))

    }

}
