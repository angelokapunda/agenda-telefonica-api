package br.bom.agenda.API.agenda.domain.repository;

import br.bom.agenda.API.agenda.domain.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {
}
