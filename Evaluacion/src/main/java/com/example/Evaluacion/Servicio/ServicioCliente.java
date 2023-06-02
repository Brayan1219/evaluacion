package com.example.Evaluacion.Servicio;

import com.example.Evaluacion.Entidad.Cliente;
import com.example.Evaluacion.Repositorio.RepositorioCliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicioCliente {

    private RepositorioCliente repositorio;

    public ServicioCliente(RepositorioCliente repositorio) {
        this.repositorio = repositorio;
    }

    public ArrayList<Cliente> ListarCliente(){
        return (ArrayList<Cliente>) repositorio.findAll();
    }

    public String AgregarCliente(Cliente cliente){
        if (repositorio.findById(cliente.getId_cliente()).isPresent()){
            return ("El Cliente ya se encuentra registrado");
        }
        else {
            repositorio.save(cliente);
            return ("El Cliente se registo con exito");
        }
    }

    public Cliente BuscarCliente(int id){
        if (repositorio.findById(id).isPresent()){
            return repositorio.findById(id).get();
        }
        else {
            return null;
        }
    }

    public String ActualizarCliente(Cliente cli){
        if (repositorio.findById(cli.getId_cliente()).isPresent()){
            repositorio.save(cli);
            return "El Cliente se actualizo con exito";
        }
        else {
            return "El cliente no se encuentra en la base de datos";
        }
    }

    public String EliminarCliente(int id){
        if (repositorio.findById(id).isPresent()){
            repositorio.deleteById(id);
            return ("El Cliente se Elimino con exito");
        }
        else {
            return ("El Cliente no se encuentra en la base de datos");
        }
    }
}
