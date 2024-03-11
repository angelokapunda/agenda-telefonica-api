package br.bom.agenda.API.agenda.domain.service;

import br.bom.agenda.API.agenda.domain.dto.CadastroDTO;
import br.bom.agenda.API.agenda.domain.model.Contacto;
import br.bom.agenda.API.agenda.domain.repository.ContactoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService {

    private ContactoRepository contactoRepository;

    public ContactoService(ContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }

    public Contacto cadastrar(CadastroDTO dados) {
        Contacto contacto = Contacto.convertToContacto(dados);
         return contactoRepository.save(contacto);
    }
    public List<Contacto> listar() {
        return contactoRepository.findAll();
    }
}

