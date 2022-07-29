package com.banregio.actividadbackend.Service;

import com.banregio.actividadbackend.Entidades.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoriaService {
    public List<Categoria> listarCategorias();

    public void guardar(Categoria categoria);

    public void eliminar(Categoria categoria);

    public Categoria encontrarCategoria(Categoria categoria);
}
