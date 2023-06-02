package com.example.Evaluacion.Controlador;

import com.example.Evaluacion.Entidad.Ventas;
import com.example.Evaluacion.Servicio.ServicioVentas;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class ControladorServicio {

    private ServicioVentas servicio;

    public ControladorServicio(ServicioVentas servicio){
        this.servicio=servicio;
    }

    @GetMapping("/ListarVentas")
    public ArrayList<Ventas> ListarVentas(){
        return servicio.ListarVentas();};


    @GetMapping("/BuscarVentas/{id}")
    public Ventas BuscarVentas(@PathVariable("id")int id){
        return servicio.BuscarVentas(id);
    }

    @PostMapping("/AgregarVentas/{idCliente}")
    public String agregarCliente(@RequestBody Ventas ventas, @PathVariable int idCliente) {
        String respuesta = servicio.AgregarVentas(ventas, idCliente);
        return respuesta;
    }

    @PutMapping("/Actualizarventas")
    public String ActualizarVentas(@RequestBody Ventas ven){
        return servicio.Actualizarventas(ven);
    }

    @DeleteMapping("/EliminarVentas/{doc}")
    public String EliminarVentas(@PathVariable("doc")int id){
        return servicio.EliminarVenta(id);
    }
}



