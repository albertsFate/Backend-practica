package com.banregio.actividadbackend.Entidades;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;


@ApiModel(description = "Productos ofrecidos por la empresa")
@Entity
@Table(name = "producto")
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idP;

    @ApiModelProperty(value = "nombre del producto")
    private String nombreP;

    @ApiModelProperty(value = "caracteristicas del producto o descripción")
    private String caracteristicasP;

    @ApiModelProperty(value = "Categoria a la que pertenece este producto")
    private String categoriaP;

}
