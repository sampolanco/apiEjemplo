package mx.sam.apiEjemplo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.sam.apiEjemplo.model.Usuario;

public interface IUSuarioRepo extends JpaRepository<Usuario,Integer>{

}
