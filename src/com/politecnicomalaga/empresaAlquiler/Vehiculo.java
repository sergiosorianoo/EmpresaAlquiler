package com.politecnicomalaga.empresaAlquiler;

public class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected String marca;
    protected int kms;
    protected double precioDia;
    protected String tipoMotor;
    protected boolean alquilado;

    public Vehiculo(String matricula, String modelo, String marca, int kms, double precioDia, String tipoMotor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.kms = kms;
        this.precioDia = precioDia;
        this.tipoMotor = tipoMotor;
        this.alquilado = false;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", kms=" + kms +
                ", precioDia=" + precioDia +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", alquilado=" + alquilado +
                '}';
    }
}
