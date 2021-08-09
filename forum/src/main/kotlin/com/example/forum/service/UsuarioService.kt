package com.example.forum.service

import com.example.forum.model.Curso
import com.example.forum.model.Usuario
import com.example.forum.repository.UsuarioRepository
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService (private val repository: UsuarioRepository) {

    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)

    }

}
