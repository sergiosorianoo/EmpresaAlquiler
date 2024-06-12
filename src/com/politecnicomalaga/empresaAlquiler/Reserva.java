package com.politecnicomalaga.empresaAlquiler;

import java.time.LocalDate;

public class Reserva {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private LocalDate fechaInicio;
    private int diasAlquiler;

    public Reserva(Vehiculo vehiculo, Cliente cliente, LocalDate fechaInicio, int diasAlquiler) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.diasAlquiler = diasAlquiler;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "vehiculo=" + vehiculo +
                ", cliente=" + cliente +
                ", fechaInicio=" + fechaInicio +
                ", diasAlquiler=" + diasAlquiler +
                '}';
    }
}

