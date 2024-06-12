package com.politecnicomalaga.empresaAlquiler;

public class Coche extends Vehiculo {
    private int plazasMax;
    private int puertas;
    private int volumenMaletero;
    private String tipo;

    public Coche(String matricula, String modelo, String marca, int kms, double precioDia, String tipoMotor, int plazasMax, int puertas, int volumenMaletero, String tipo) {
        super(matricula, modelo, marca, kms, precioDia, tipoMotor);
        this.plazasMax = plazasMax;
        this.puertas = puertas;
        this.volumenMaletero = volumenMaletero;
        this.tipo = tipo;
    }

    public int getPlazasMax() {
        return plazasMax;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Coche{" +
                "plazasMax=" + plazasMax +
                ", puertas=" + puertas +
                ", volumenMaletero=" + volumenMaletero +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

