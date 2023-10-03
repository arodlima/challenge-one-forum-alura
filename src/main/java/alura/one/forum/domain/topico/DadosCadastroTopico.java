package alura.one.forum.domain.topico;

import alura.one.forum.dto.Curso;
import alura.one.forum.dto.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTopico(

        @NotBlank
        String titulo,

        @NotBlank
        String mensagem,

        @NotNull
        Status status,

        @NotBlank
        String autor,

        @NotNull
        Curso curso) {
}
