package com.politecnicomalaga.empresaAlquiler;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String dni;
    private String numeroTarjeta;

    public Cliente(String nombre, String apellidos, String email, String telefono, String dni, String numeroTarjeta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", dni='" + dni + '\'' +
                ", numeroTarjeta='" + numeroTarjeta + '\'' +
                '}';
    }
}
