package com.banregio.actividadbackend.DAO;

import com.banregio.actividadbackend.Entidades.Categoria;
import com.banregio.actividadbackend.Entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
