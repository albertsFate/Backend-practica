package com.banregio.actividadbackend.Service;

import com.banregio.actividadbackend.Entidades.Producto;
import com.banregio.actividadbackend.Entidades.Venta;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface ProductoService {


    public List<Producto> listarProducto();

    public void guardar(Producto producto);

    public void eliminar(Producto producto);

    public Producto encontrarProducto(Producto producto);


}
