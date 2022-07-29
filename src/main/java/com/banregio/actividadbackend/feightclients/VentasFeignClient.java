package com.banregio.actividadbackend.feightclients;

import com.banregio.actividadbackend.Entidades.Venta;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "ventas-service", url = "http://localhost:8002")
@RequestMapping(value = "/venta")
public interface VentasFeignClient {


    @GetMapping("/agregarV")
    Venta guardarV(@RequestBody Venta venta);



}
