package ec.edu.espe.arquitectura.server.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

double
@Builder
public class TransferenciaDTO {

    private String cuentaOrigen;

    private String cuentaDestino;

    private BigDecimal valor;

    public double getValor() {
        return 0;
    }
}
