package com.crud.repositories;

import com.crud.Model.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;


    public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
    }
