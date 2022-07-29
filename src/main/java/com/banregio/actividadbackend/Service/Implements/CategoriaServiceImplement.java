package com.banregio.actividadbackend.Service.Implements;

import com.banregio.actividadbackend.DAO.CategoriaDao;
import com.banregio.actividadbackend.Entidades.Categoria;
import com.banregio.actividadbackend.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoriaServiceImplement implements CategoriaService {
    @Autowired
    private CategoriaDao categoriaDao;


    @Override
    @Transactional(readOnly = false)
    public List<Categoria> listarCategorias() {
        return (List<Categoria>) categoriaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void eliminar(Categoria categoria) {
        categoriaDao.delete(categoria);
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria encontrarCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdC()).orElse(null);
    }


}
