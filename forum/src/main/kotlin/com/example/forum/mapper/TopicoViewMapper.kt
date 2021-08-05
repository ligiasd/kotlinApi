package com.example.forum.mapper

import com.example.forum.dto.TopicoView
import com.example.forum.model.Topico
import org.springframework.stereotype.Component

@Component
class TopicoViewMapper: Mapper <Topico, TopicoView> {

    override fun map(t: Topico): TopicoView {
        return TopicoView(
            id = t.id,
            titulo = t.titulo,
            mensagem = t.mensagem,
            dataCriacao = t.dataDescricao,
            status = t.status

        )
    }
}