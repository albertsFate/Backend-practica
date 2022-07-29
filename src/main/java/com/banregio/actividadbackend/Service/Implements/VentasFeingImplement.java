package com.banregio.actividadbackend.Service.Implements;

import com.banregio.actividadbackend.Entidades.Venta;
import com.banregio.actividadbackend.feightclients.VentasFeignClient;
import org.springframework.stereotype.Service;

@Service
public class VentasFeingImplement implements VentasFeignClient {

    @Override
    public Venta guardarV(Venta venta) {
        return venta;
    }
}
