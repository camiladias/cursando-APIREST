package com.cursando.cursando.controllers;

import com.cursando.cursando.models.Aluno;
import com.cursando.cursando.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
/*
* Classe controladora do aluno responsavel por receber requisicoes relacionadas a entidade aluno
* */

@RestController
public class AlunoController {

    @Autowired
    AlunoService alunoService;
/*
* Endpoint responsavel por realizar o login do aluno
* */
    @RequestMapping(value="/login", method = RequestMethod.POST, produces="application/json")
    public Aluno login(Principal principal) {
        return alunoService.findAlunoByEmail(principal.getName());
    }
}
