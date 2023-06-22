package com.amdocs.db.repository;

import org.springframework.data.repository.CrudRepository;

import com.amdocs.db.models.StudentModel;

import java.util.List;

public interface StudentRepository extends CrudRepository<StudentModel, Long> {
    public abstract List<StudentModel> findByNombre(String nombre);
}



/*
 * 
 * import org.springframework.data.repository.CrudRepository;
 * import org.springframework.stereotype.Repository;
 * 
 * import com.mozcalti.base.models.UsuarioModel;
 * import java.util.List;
 */

/*
 * @Repository
 * public interface UsuarioRepository extends CrudRepository<UsuarioModel,
 * Long>{
 * public abstract List<UsuarioModel> findByNombre(String nombre);
 * }
 */
