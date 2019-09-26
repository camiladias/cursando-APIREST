package com.cursando.cursando.services;

import com.cursando.cursando.models.Aluno;
import com.cursando.cursando.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
* Classe que implementa as regras de negocio
* */
@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;
/**
 * Invoca o repository de aluno para buscar o aluno com o e-mail informado
 */
    public Aluno findAlunoByEmail(String email) {
        return alunoRepository.findByEmail(email);
    }
}
