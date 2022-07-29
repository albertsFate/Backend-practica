package com.banregio.actividadbackend.controllers;

import com.banregio.actividadbackend.Entidades.Producto;
import com.banregio.actividadbackend.Entidades.Venta;
import com.banregio.actividadbackend.Service.ProductoService;
import com.banregio.actividadbackend.feightclients.VentasFeignClient;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Qualifier("ventasFeingImplement")
    @Autowired
    private VentasFeignClient ventasFeignClient;

    @ApiOperation(value="Agrega un producto a la categoria", notes = "generar una nueva categoria")
    @GetMapping("/agregar")
    public String agregar(Producto producto){
        return "modificar";
    }

    @ApiOperation(value = "Modifica y guarda cambios en las modificaciones", notes = "El producto tiene que existir")
    @PostMapping("/guardar")
    public String guardar(Producto producto, BindingResult errores){
        if(errores.hasErrors()){
            return "modificar";
        }
        productoService.guardar(producto);
        return "redirect:/";
    }

    @ApiOperation(value = "Busca por ID alguno de los productos existentes y lo muestra en pantalla para poder modificarlo", notes = "Solo se puede editar si existe y con las caracteristicas existentes")
    @GetMapping("/editar/{idP}")
    public String editar(Producto producto, Model model){
        producto = productoService.encontrarProducto(producto);
        model.addAttribute("producto", producto);
        return "modificar";
    }

    @ApiOperation(value = "Elimina algun producto por numero de ID", notes = "Solo se puede editar si existe el numero de ID")
    @GetMapping("/eliminar/{idP}")
    public String eliminar(Producto producto){
        productoService.eliminar(producto);
        return "redirect:/";
    }

    @GetMapping("/agregarV")
    public Venta guardarV(@PathVariable("idV") long idV, @RequestBody Venta venta){
        Venta ventaNew = ventasFeignClient.guardarV(venta);
        return ventaNew;
    }

}
