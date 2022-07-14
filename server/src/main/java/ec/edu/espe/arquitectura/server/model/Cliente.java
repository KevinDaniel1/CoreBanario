package ec.edu.espe.arquitectura.server.model;

import lombok.Builder;
import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Builder
@Document(collection = "cliente")
@TypeAlias("cliente")
public class Cliente {

    @Id
    private String id;

    private String nombreCompleto;

    @Indexed(name = "idxu_persona_cedula", unique = true)
    private String cedula;

    private String estado;

}
