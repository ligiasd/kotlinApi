package com.example.forum.controller

import com.example.forum.dto.NovoTopicoForm
import com.example.forum.dto.TopicoView
import com.example.forum.service.TopicoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topicos")
class TopicoController (private val service: TopicoService){
    @GetMapping
    fun listar(): List<TopicoView> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoView{
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody dto: NovoTopicoForm){
        service.cadastrar(dto)

    }

}