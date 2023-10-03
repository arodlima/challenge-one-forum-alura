package alura.one.forum.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicoRepositoy extends JpaRepository<Topico, Long> {

    Page<Topico> findAllByAtivoTrue(Pageable paginacao);

}
