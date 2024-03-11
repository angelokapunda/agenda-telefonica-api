package br.bom.agenda.API.agenda.domain.model;

import br.bom.agenda.API.agenda.domain.dto.CadastroDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contactos")
@EqualsAndHashCode(of = "id")
@Entity
@Builder
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String celular;
    private String celular_2;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;


    public static Contacto convertToContacto(CadastroDTO dados) {
         Contacto contacto = Contacto.builder()
                .nome(dados.nome())
                .sobrenome(dados.sobrenome())
                .email(dados.email())
                .celular(dados.celular())
                .celular_2(dados.celular_2())
                .categoria(dados.categoria())
                .build();
        return contacto;
    }

}
