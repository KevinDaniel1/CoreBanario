package ec.edu.espe.arquitectura.server.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "cuenta")
@TypeAlias("cuenta")
public class Cuenta {

    private String idClient;

    private String codigoInterno;

    private BigDecimal saldo;

    private Date fechaUltimoMovimiento;

    private String estado;

}
