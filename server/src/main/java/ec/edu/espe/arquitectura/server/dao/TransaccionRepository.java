package ec.edu.espe.arquitectura.server.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.server.model.Transferencia;

public interface TransaccionRepository extends MongoRepository<Transferencia,String>{
    
    List<Transferencia> findByValorGreaterThan(BigDecimal valor);

}
