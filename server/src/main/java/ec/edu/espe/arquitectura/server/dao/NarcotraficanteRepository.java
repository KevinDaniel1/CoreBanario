package ec.edu.espe.arquitectura.server.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.server.model.Narcotraficante;

public interface NarcotraficanteRepository extends MongoRepository<Narcotraficante,String>{
    
}
