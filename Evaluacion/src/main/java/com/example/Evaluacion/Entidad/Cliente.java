package com.example.Evaluacion.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.Length;

import java.util.Set;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(length = 11)
    private int id_cliente;
    @Column(length = 50,nullable = false)
    private String Nombre;
    @Column(length = 11,nullable = false)
    private String Telefono;
    @Column(length = 50,nullable = false)
    private String direccion;

    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Ventas>ventas;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre, String telefono, String direccion) {
        this.id_cliente = id_cliente;
        Nombre = nombre;
        Telefono = telefono;
        this.direccion = direccion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(Set<Ventas> ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_cliente=" + id_cliente +
                ", Nombre='" + Nombre + '\'' +
                ", Telefono=" + Telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
