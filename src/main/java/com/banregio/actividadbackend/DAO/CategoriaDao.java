package com.banregio.actividadbackend.DAO;

import com.banregio.actividadbackend.Entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {

}
