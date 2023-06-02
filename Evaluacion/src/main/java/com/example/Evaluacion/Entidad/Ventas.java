package com.example.Evaluacion.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ventas")
public class Ventas {

    @Id
    @Column(length = 30)
    private int id_venta;
    @ManyToOne()
    @JoinColumn(name = "id_cliente")
    @JsonIgnore
    private Cliente cliente;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Ventas() {
    }

    public Ventas(int id_venta, Cliente cliente, Vehiculo vehiculo, Date fecha) {
        this.id_venta = id_venta;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }



    @Override
    public String toString() {
        return "Ventas{" +
                "id_venta=" + id_venta +
                ", cliente=" + cliente +
                ", fecha=" + fecha +
                '}';
    }
}
