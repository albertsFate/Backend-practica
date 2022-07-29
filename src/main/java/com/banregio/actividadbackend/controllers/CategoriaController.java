package com.banregio.actividadbackend.controllers;

import com.banregio.actividadbackend.Entidades.Categoria;
import com.banregio.actividadbackend.Entidades.Producto;
import com.banregio.actividadbackend.Service.CategoriaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @ApiOperation(value="Agrega una nueva categoria de productos", notes = "En base a los productos se genera una nueva categoria")
    @GetMapping("/agregar")
    public String agregar(Categoria categoria){
        return "modificar";
    }
    @ApiOperation(value="Es el proceso de guardado para la modificación o creación de una nueva categoria", notes = "Guarda los cambios")
    @PostMapping("/guardar")
    public String guardar(Categoria categoria, BindingResult errores){
        if(errores.hasErrors()){
            return "modificar";
        }
        categoriaService.guardar(categoria);
        return "redirect:/";
    }

    @ApiOperation(value="Edita las caracteristicas de una categoria por id", notes = "La categoria e id deben existir en la tabla")
    @GetMapping("/editar/{idP}")
    public String editar(Categoria categoria, Model model){
        categoria = categoriaService.encontrarCategoria(categoria);
        model.addAttribute("categoria", categoria);
        return "modificar";
    }

    @ApiOperation(value="Elimina categorias por ID", notes = "El id de la categoria debe existir y no debe tener ligados productos")
    @GetMapping("/eliminar/{idP}")
    public String eliminar(Categoria categoria){
        categoriaService.eliminar(categoria);
        return "redirect:/";
    }
}
