package com.politecnicomalaga.empresaAlquiler;

public class Furgon extends Vehiculo {
    private int cargaMax;
    private int plazasAsientos;

    public Furgon(String matricula, String modelo, String marca, int kms, double precioDia, String tipoMotor, int cargaMax, int plazasAsientos) {
        super(matricula, modelo, marca, kms, precioDia, tipoMotor);
        this.cargaMax = cargaMax;
        this.plazasAsientos = plazasAsientos;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public int getPlazasAsientos() {
        return plazasAsientos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Furgon{" +
                "cargaMax=" + cargaMax +
                ", plazasAsientos=" + plazasAsientos +
                '}';
    }
}
