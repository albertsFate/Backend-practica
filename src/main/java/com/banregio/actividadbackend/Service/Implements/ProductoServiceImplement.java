package com.banregio.actividadbackend.Service.Implements;

import com.banregio.actividadbackend.DAO.ProductoDao;
import com.banregio.actividadbackend.Entidades.Producto;
import com.banregio.actividadbackend.Entidades.Venta;
import com.banregio.actividadbackend.Service.ProductoService;
import com.banregio.actividadbackend.feightclients.VentasFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImplement implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Autowired
    private VentasFeignClient ventasFeignClient;

    @Override
    @Transactional (readOnly = false)
    public List<Producto> listarProducto() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void eliminar(Producto producto) {
        productoDao.delete(producto);
    }

    @Override
    @Transactional(readOnly = true)
    public Producto encontrarProducto(Producto producto) {
        return productoDao.findById(producto.getIdP()).orElse(null);
    }


}
