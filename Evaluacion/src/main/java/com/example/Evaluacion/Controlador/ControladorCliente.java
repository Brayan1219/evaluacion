package com.example.Evaluacion.Controlador;

import com.example.Evaluacion.Entidad.Cliente;
import com.example.Evaluacion.Servicio.ServicioCliente;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class ControladorCliente {
    private ServicioCliente servicio;

    public ControladorCliente(ServicioCliente servicio){
        this.servicio=servicio;
    }

    @GetMapping("/ListarClientes")
    public ArrayList<Cliente> ListarCliente(){
        return servicio.ListarCliente();
    }

    @GetMapping("/BuscarClientes/{id}")
    public Cliente BuscarCliente(@PathVariable("id")int id){
        return servicio.BuscarCliente(id);
    }

    @PostMapping("/AgregarClientes")
    public String agregarCliente(@RequestBody Cliente cli) {
        return servicio.AgregarCliente(cli);

    }

    @PutMapping("/ActualizarClientes")
    public String ActualizarCliente(@RequestBody Cliente cli){
        return servicio.ActualizarCliente(cli);
    }

    @DeleteMapping("/EliminarClientes/{doc}")
    public String EliminarCliente(@PathVariable("doc")int id){
        return servicio.EliminarCliente(id);
    }
}

