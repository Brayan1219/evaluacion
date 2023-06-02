package com.example.Evaluacion.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.Length;

import java.util.Set;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    @Column(length = 11)
    private int id_vehiculo;
    @Column(length = 20)
    private String marca;
    @Column(length = 30)
    private int modelo;
    @Column(length = 30)
    private String precio;

    @ManyToOne()
    @JoinColumn(name = "id_cosesionario")
    @JsonIgnore
    private Concesionario consesionario ;

    public Vehiculo() {
    }

    public Vehiculo(int id_vehiculo, String marca, int modelo, String precio, Concesionario consesionario) {
        this.id_vehiculo = id_vehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.consesionario = consesionario;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Concesionario getConsesionario() {
        return consesionario;
    }

    public void setConsesionario(Concesionario consesionario) {
        this.consesionario = consesionario;
    }



    @Override
    public String toString() {
        return "Vehiculo{" +
                "id_vehiculo=" + id_vehiculo +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", precio='" + precio + '\'' +
                ", consesionario=" + consesionario +
                '}';
    }
}
