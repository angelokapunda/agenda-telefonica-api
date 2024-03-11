package br.bom.agenda.API.agenda.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EntidadeNaoEncontradaException extends RuntimeException{

    public EntidadeNaoEncontradaException(String message) {
        super(message);
    }
    public  EntidadeNaoEncontradaException(Long id) {
        super(String.format("O contacto de código %s não foi encontado", id));
    }
}
