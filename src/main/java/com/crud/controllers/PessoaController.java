package com.crud.controllers;

import com.crud.Model.Pessoa;
import com.crud.dto.PessoaDTO;
import com.crud.repositories.PessoaRepository;
import com.crud.services.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;

@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/V1/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    @GetMapping("/{id}")
    public PessoaDTO findById(@PathVariable @NotNull @Positive Integer id) {
        return pessoaService.findById(id);

    }










}
