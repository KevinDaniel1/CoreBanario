package ec.edu.espe.arquitectura.server.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.server.dao.TransaccionRepository;
import ec.edu.espe.arquitectura.server.dto.TransferenciaDTO;
import ec.edu.espe.arquitectura.server.model.Transferencia;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransferenciaService {
    
    private final TransaccionRepository transaccionRepository;

    public Transferencia create(TransferenciaDTO dto) {
        Transferencia transaferencia = new Transferencia();
        transaferencia.setCodigoInterno(UUID.randomUUID().toString());
        transaferencia.setCuentaOrigen(dto.getCuentaOrigen());
        transaferencia.setCuentaDestino(dto.getCuentaDestino());


        transaferencia.setEstado("");
        transaferencia.setValor(dto.getValor());

    

        return transaferencia;
    }

    public void validar(TransferenciaDTO dto) {
        Transferencia transaferencia = new Transferencia();

        if(Math.max(dto.getValor(),1000.00))
        {
            
        }else
        {
            this.create(dto);
        }

    }

}
