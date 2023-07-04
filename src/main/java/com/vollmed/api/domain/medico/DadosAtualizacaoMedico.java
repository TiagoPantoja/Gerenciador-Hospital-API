package com.vollmed.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import com.vollmed.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
