package ec.edu.espe.arquitectura.server.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.server.dto.TransferenciaDTO;
import ec.edu.espe.arquitectura.server.model.Cliente;
import ec.edu.espe.arquitectura.server.model.Transferencia;
import ec.edu.espe.arquitectura.server.service.TransferenciaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/Transaferencia")
@RequiredArgsConstructor
public class TransaferenciaResource {

    private final TransferenciaService service;

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody TransferenciaDTO dto) {
      try {
        Transferencia transafenrecia = this.service.create(dto);
        return ResponseEntity.ok(transafenrecia);
      } catch (Exception e) {
        e.printStackTrace();
        return ResponseEntity.badRequest().build();
      }
    }
    
}
