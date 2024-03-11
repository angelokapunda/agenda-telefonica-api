package br.bom.agenda.API.agenda.controller;

import br.bom.agenda.API.agenda.domain.dto.CadastroDTO;
import br.bom.agenda.API.agenda.domain.model.Contacto;
import br.bom.agenda.API.agenda.domain.service.ContactoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contactos")
public class ContactoController {

    private ContactoService contacto;

    public ContactoController(ContactoService contactoService) {
        this.contacto = contactoService;
    }

    @PostMapping
    public ResponseEntity<Contacto> cadastrar(@RequestBody @Valid CadastroDTO dados) {
        contacto.cadastrar(dados);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public List<Contacto> listagem () {
        return contacto.listar();
    }

    @GetMapping("/{id}")
    public Contacto busca (@PathVariable Long id) {
        return contacto.buscar(id);
    }
}
