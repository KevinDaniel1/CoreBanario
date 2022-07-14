package ec.edu.espe.arquitectura.server.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.server.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente,String>{
    
    List<Cliente> findByNombre(String nombre);
    List<Cliente> findByDireccionesCiudad(String ciudad);
    Optional<Cliente> findByCedula(String cedula);
}
