package alura.one.forum.domain.topico;

import alura.one.forum.dto.Curso;
import alura.one.forum.dto.Status;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(

        @NotNull
        Long id,
        String titulo,
        String mensagem,
        Status status,
        Curso curso) {
}
