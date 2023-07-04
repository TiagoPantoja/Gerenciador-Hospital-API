package com.vollmed.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import com.vollmed.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
    @NotNull
    Long id,
    String nome,
    String telefone,
    DadosEndereco endereco) {
}

