package alura.one.forum.domain.topico;

import alura.one.forum.dto.Curso;
import alura.one.forum.dto.Status;

import java.time.LocalDateTime;

public record DadosListagemTopico(

        Long id,
        String titulo,
        String mensagem,
        LocalDateTime data_criacao,
        Status status,
        String autor,
        Curso curso) {

    public DadosListagemTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso());
    }
}
