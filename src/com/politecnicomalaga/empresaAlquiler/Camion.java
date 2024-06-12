package com.politecnicomalaga.empresaAlquiler;

public class Camion extends Vehiculo {
    private int cargaMax;
    private double longitud;

    public Camion(String matricula, String modelo, String marca, int kms, double precioDia, String tipoMotor, int cargaMax, double longitud) {
        super(matricula, modelo, marca, kms, precioDia, tipoMotor);
        this.cargaMax = cargaMax;
        this.longitud = longitud;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public double getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return super.toString() + ", Camion{" +
                "cargaMax=" + cargaMax +
                ", longitud=" + longitud +
                '}';
    }
}
