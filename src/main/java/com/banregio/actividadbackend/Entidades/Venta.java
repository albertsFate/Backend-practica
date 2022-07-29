package com.banregio.actividadbackend.Entidades;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@ApiModel(description = "Ventas realizadas por la empresa")
@Entity
@Table(name = "ventas")
@Data
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idV;

    @ApiModelProperty(value = "Nombre de la venta")
    private String producto_v;

    @ApiModelProperty(value = "Cantidad de productos vendidos")
    private String cantidad_v;

    @ApiModelProperty(value = "precio del producto")
    private Double precioV;

}
