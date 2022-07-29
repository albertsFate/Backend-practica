package com.banregio.actividadbackend.Entidades;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@ApiModel(description = "Diferentes categorias de los productos existentes de la empresa")
@Entity
@Table(name = "categoria")
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idC;

    @ApiModelProperty(value = "Nombre de la categoria")
    private String nombreC;

    @ApiModelProperty(value = "Caracteriscticas de la categoria o que productos puede contener esta categoria")
    private String descripcionC;

}
