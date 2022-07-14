package ec.edu.espe.arquitectura.server.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.server.model.Cuenta;

public interface CuentaRepository extends MongoRepository<Cuenta,String>{
    
}
