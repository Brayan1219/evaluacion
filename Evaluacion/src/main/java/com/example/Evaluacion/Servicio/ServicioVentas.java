package com.example.Evaluacion.Servicio;

import com.example.Evaluacion.Entidad.Cliente;
import com.example.Evaluacion.Entidad.Ventas;
import com.example.Evaluacion.Repositorio.RepositorioCliente;
import com.example.Evaluacion.Repositorio.RepositorioVentas;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicioVentas {

    private RepositorioVentas repositorio;
    private RepositorioCliente repocli;

    public ServicioVentas(RepositorioVentas repositorio, RepositorioCliente repocli) {
        this.repositorio = repositorio;
        this.repocli = repocli;
    }

    public ArrayList<Ventas> ListarVentas() {
        return (ArrayList<Ventas>) repositorio.findAll();
    }

    public String AgregarVentas(Ventas ventas,int id_cliente){
        if (repocli.findById(id_cliente).isPresent()){
            Cliente cli=repocli.findById(id_cliente).get();
            ventas.setCliente(cli);
            repositorio.save(ventas);
            return "Venta Registrada";
        }
        else {
            return "la venta no se  registro";
        }
    }

    public Ventas BuscarVentas(int id){
        if (repositorio.findById(id).isPresent()){
            return repositorio.findById(id).get();
        }
        else {
            return null;
        }
    }

    public String Actualizarventas(Ventas ven){
        if (repositorio.findById(ven.getId_venta()).isPresent()){
            repositorio.save(ven);
            return "la venta se actualizo exitosamente";
        }
        else {
            return "la venta no se encuentra en la base de datos";
        }
    }


    public String EliminarVenta(int id){
        if (repositorio.findById(id).isPresent()){
            repositorio.deleteById(id);
            return ("La venta se elimino con exito");
        }
        else {
            return ("La venta no esta en la base de datos");
        }
    }


}
