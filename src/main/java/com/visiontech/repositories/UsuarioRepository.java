package com.visiontech.repositories;


import com.visiontech.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Usuario findOneByUsername(String username);

    @Query("SELECT usuario FROM Usuario usuario where usuario.nombre like %:nombre%")
    public List<Usuario> buscarPorNombre(@Param("nombre") String nombre);

    Usuario findByNombre(String nombre);

}
