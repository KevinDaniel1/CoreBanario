package ec.edu.espe.arquitectura.server.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "transferencia")
@TypeAlias("transferencia")
public class Transferencia {
    
    @Id
    private String id;

    @Indexed(name = "idxu_transaccion_codigoInterno", unique = true)
    private String codigoInterno;

    private String cuentaOrigen;

    private String cuentaDestino;

    private BigDecimal valor;

    private String estado;
}
