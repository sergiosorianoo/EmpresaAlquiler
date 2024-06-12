package com.politecnicomalaga.empresaAlquiler;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    protected List<Vehiculo> vehiculos;
    protected List<Cliente> clientes;
    private List<Reserva> reservas;

    public Empresa() {
        vehiculos = new ArrayList<>();
        clientes = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void addReserva(Reserva reserva) {
        reserva.getVehiculo().setAlquilado(true);
        reservas.add(reserva);
    }

    public List<Vehiculo> buscarCoches(int plazas, String tipoMotor) {
        List<Vehiculo> resultado = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche) {
                Coche c = (Coche) v;
                if (c.getPlazasMax() > plazas && c.tipoMotor.equals(tipoMotor) && !c.isAlquilado()) {
                    resultado.add(c);
                }
            }
        }
        return resultado;
    }

    public List<Vehiculo> buscarFurgones(int carga, int plazas) {
        List<Vehiculo> resultado = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v instanceof Furgon) {
                Furgon f = (Furgon) v;
                if (f.getCargaMax() > carga && f.getPlazasAsientos() > plazas && !f.isAlquilado()) {
                    resultado.add(f);
                }
            }
        }
        return resultado;
    }

    public List<Vehiculo> buscarCamiones(int carga, double longitud) {
        List<Vehiculo> resultado = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion) {
                Camion c = (Camion) v;
                if (c.getCargaMax() > carga && c.getLongitud() < longitud && !c.isAlquilado()) {
                    resultado.add(c);
                }
            }
        }
        return resultado;
    }

    public double devolverVehiculo(Reserva reserva, int kmsRecorridos) {
        reserva.getVehiculo().setAlquilado(false);
        reserva.getVehiculo().setKms(reserva.getVehiculo().kms + kmsRecorridos);
        double precio = reserva.getVehiculo().getPrecioDia() * reserva.getDiasAlquiler();
        if (kmsRecorridos / reserva.getDiasAlquiler() > 500) {
            precio *= 1.2;
        }
        reservas.remove(reserva);
        return precio;
    }

    public Reserva getReservaPorVehiculo(String matricula) {
        for (Reserva r : reservas) {
            if (r.getVehiculo().getMatricula().equals(matricula)) {
                return r;
            }
        }
        return null;
    }
}
