package com.example.forum.service

import com.example.forum.model.Curso
import com.example.forum.repository.CursoRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CursoService(private val repository : CursoRepository) {

    fun buscarPorId(id: Long): Curso {
        return repository.getOne(id)
    }

}
