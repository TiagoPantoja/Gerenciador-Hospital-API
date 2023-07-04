package com.vollmed.api.domain.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotNull
        @NotBlank
        String logradouro,
        @NotNull
        @NotBlank
        String bairro,
        @NotNull
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,
        @NotNull
        @NotBlank
        String cidade,
        @NotNull
        @NotBlank
        String uf,
        String complemento,
        String numero) {
}
