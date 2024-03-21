package br.bom.agenda.API.agenda.domain.service;

import br.bom.agenda.API.agenda.domain.dto.CadastroDTO;
import br.bom.agenda.API.agenda.domain.exception.EntidadeNaoEncontradaException;
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

    public Contacto buscar(Long id) {
        return contactoRepository.findById(id).orElseThrow(() -> new EntidadeNaoEncontradaException("Contacto não encontrado, verifique e tnte novamente."));
    }

//    public Contacto actualizar (ActualizacaoDTO dados , Long id) {
//        var contactoActual = contactoRepository.getReferenceById(id);
//       contactoActual.actualizaCntacto(dados);
//        return contactoRepository.save();
//    }

    public void excluir(Long id) {
        Contacto contacto = buscar(id);
        if (contacto != null) {
            contactoRepository.deleteById(contacto.getId());
        }
    }
}

