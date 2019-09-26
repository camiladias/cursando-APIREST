package com.cursando.cursando.repositories;

import com.cursando.cursando.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Interface que comunica com o banco de dados para retornar o aluno com e-mail informado
 * */
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Aluno findByEmail(String email);

}
