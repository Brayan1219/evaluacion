package com.example.Evaluacion.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "consesionario")
public class Concesionario {

    @Id
    @Column(length = 30)
    private int id_cosesionario;
    @Column(length = 50)
    private String nombre;
    @Column(length = 12)
    private String telefono;
    @Column(length = 30)
    private String direccion;

    @OneToMany(mappedBy = "consesionario",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Vehiculo> vehiculo;

    public Concesionario() {
    }

    public Concesionario(int id_cosesionario, String nombre, String telefono, String direccion) {
        this.id_cosesionario = id_cosesionario;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId_cosesionario() {
        return id_cosesionario;
    }

    public void setId_cosesionario(int id_cosesionario) {
        this.id_cosesionario = id_cosesionario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
