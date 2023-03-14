package com.crud.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {

    @NotBlank
    private String nome;
    @NotBlank
    private String sobrenome;
    @NotBlank
    @Size(max = 11)
    private String CPF;
    @NotBlank
    private String email;
    @NotBlank
    private String endereco;
    @NotBlank
    private String nacionalidade;

}
