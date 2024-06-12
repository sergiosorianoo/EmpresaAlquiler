package com.politecnicomalaga.empresaAlquiler;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Empresa empresa = new Empresa();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            mostrarMenu();
            int opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    altaVehiculo();
                    break;
                case 2:
                    altaCliente();
                    break;
                case 3:
                    alquilarVehiculo();
                    break;
                case 4:
                    buscarVehiculos();
                    break;
                case 5:
                    devolverVehiculo();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Dar de alta un vehículo");
        System.out.println("2. Dar de alta un cliente");
        System.out.println("3. Alquilar un vehículo");
        System.out.println("4. Buscar vehículos");
        System.out.println("5. Devolver un vehículo");
        System.out.println("6. Salir");
        System.out.print("Elija una opción: ");
        System.out.println(" ");
    }

    private static void altaVehiculo() {
        System.out.println("\n--- Alta de Vehículo ---");
        System.out.print("Tipo de vehículo (coche, furgon, camion): ");
        String tipo = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Kms recorridos: ");
        int kms = Integer.parseInt(scanner.nextLine());
        System.out.print("Precio por día: ");
        double precioDia = Double.parseDouble(scanner.nextLine());
        System.out.print("Tipo de motor (eléctrico, híbrido enchufable, híbrido, gasolina, diesel): ");
        String tipoMotor = scanner.nextLine();

        switch (tipo.toLowerCase()) {
            case "coche":
                System.out.print("Plazas máximas: ");
                int plazasMax = Integer.parseInt(scanner.nextLine());
                System.out.print("Puertas: ");
                int puertas = Integer.parseInt(scanner.nextLine());
                System.out.print("Volumen del maletero: ");
                int volumenMaletero = Integer.parseInt(scanner.nextLine());
                System.out.print("Tipo (utilitario, berlina, monovolumen, suv): ");
                String tipoCoche = scanner.nextLine();
                empresa.addVehiculo(new Coche(matricula, modelo, marca, kms, precioDia, tipoMotor, plazasMax, puertas, volumenMaletero, tipoCoche));
                break;
            case "furgon":
                System.out.print("Carga máxima: ");
                int cargaMaxFurgon = Integer.parseInt(scanner.nextLine());
                System.out.print("Plazas de asientos: ");
                int plazasAsientos = Integer.parseInt(scanner.nextLine());
                empresa.addVehiculo(new Furgon(matricula, modelo, marca, kms, precioDia, tipoMotor, cargaMaxFurgon, plazasAsientos));
                break;
            case "camion":
                System.out.print("Carga máxima: ");
                int cargaMaxCamion = Integer.parseInt(scanner.nextLine());
                System.out.print("Longitud: ");
                double longitud = Double.parseDouble(scanner.nextLine());
                empresa.addVehiculo(new Camion(matricula, modelo, marca, kms, precioDia, tipoMotor, cargaMaxCamion, longitud));
                break;
            default:
                System.out.println("Tipo de vehículo no válido");
                return;
        }
        System.out.println("Vehículo dado de alta con éxito");
    }

    private static void altaCliente() {
        System.out.println("\n--- Alta de Cliente ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Número de tarjeta de crédito: ");
        String numeroTarjeta = scanner.nextLine();

        empresa.addCliente(new Cliente(nombre, apellidos, email, telefono, dni, numeroTarjeta));
        System.out.println("Cliente dado de alta con éxito");
    }

    private static void alquilarVehiculo() {
        System.out.println("\n--- Alquiler de Vehículo ---");
        System.out.print("DNI del cliente: ");
        String dni = scanner.nextLine();
        Cliente cliente = buscarClientePorDNI(dni);
        if (cliente == null) {
            System.out.println("Cliente no encontrado");
            return;
        }

        System.out.print("Matrícula del vehículo: ");
        String matricula = scanner.nextLine();
        Vehiculo vehiculo = buscarVehiculoPorMatricula(matricula);
        if (vehiculo == null || vehiculo.isAlquilado()) {
            System.out.println("Vehículo no disponible");
            return;
        }

        System.out.print("Fecha de inicio (YYYY-MM-DD): ");
        LocalDate fechaInicio = LocalDate.parse(scanner.nextLine());
        System.out.print("Días de alquiler: ");
        int diasAlquiler = Integer.parseInt(scanner.nextLine());

        empresa.addReserva(new Reserva(vehiculo, cliente, fechaInicio, diasAlquiler));
        System.out.println("Vehículo alquilado con éxito");
    }

    private static Cliente buscarClientePorDNI(String dni) {
        for (Cliente c : empresa.clientes) {
            if (c.toString().contains(dni)) {
                return c;
            }
        }
        return null;
    }

    private static Vehiculo buscarVehiculoPorMatricula(String matricula) {
        for (Vehiculo v : empresa.vehiculos) {
            if (v.getMatricula().equals(matricula)) {
                return v;
            }
        }
        return null;
    }

    private static void buscarVehiculos() {
        System.out.println("\n--- Búsqueda de Vehículos ---");
        System.out.print("Tipo de vehículo (coche, furgon, camion): ");
        String tipo = scanner.nextLine();
        switch (tipo.toLowerCase()) {
            case "coche":
                System.out.print("Plazas mínimas: ");
                int plazas = Integer.parseInt(scanner.nextLine());
                System.out.print("Tipo de motor: ");
                String tipoMotor = scanner.nextLine();
                List<Vehiculo> coches = empresa.buscarCoches(plazas, tipoMotor);
                if (coches.isEmpty()) {
                    System.out.println("No se encontraron coches con esos parámetros");
                } else {
                    for (Vehiculo coche : coches) {
                        System.out.println(coche);
                    }
                }
                break;
            case "furgon":
                System.out.print("Carga mínima: ");
                int cargaFurgon = Integer.parseInt(scanner.nextLine());
                System.out.print("Plazas mínimas: ");
                int plazasFurgon = Integer.parseInt(scanner.nextLine());
                List<Vehiculo> furgones = empresa.buscarFurgones(cargaFurgon, plazasFurgon);
                if (furgones.isEmpty()) {
                    System.out.println("No se encontraron furgones con esos parámetros");
                } else {
                    for (Vehiculo furgon : furgones) {
                        System.out.println(furgon);
                    }
                }
                break;
            case "camion":
                System.out.print("Carga mínima: ");
                int cargaCamion = Integer.parseInt(scanner.nextLine());
                System.out.print("Longitud máxima: ");
                double longitudCamion = Double.parseDouble(scanner.nextLine());
                List<Vehiculo> camiones = empresa.buscarCamiones(cargaCamion, longitudCamion);
                if (camiones.isEmpty()) {
                    System.out.println("No se encontraron camiones con esos parámetros");
                } else {
                    for (Vehiculo camion : camiones) {
                        System.out.println(camion);
                    }
                }
                break;
            default:
                System.out.println("Tipo de vehículo no válido");
        }
    }

    private static void devolverVehiculo() {
        System.out.println("\n--- Devolución de Vehículo ---");
        System.out.print("Matrícula del vehículo: ");
        String matricula = scanner.nextLine();
        Reserva reserva = empresa.getReservaPorVehiculo(matricula);
        if (reserva == null) {
            System.out.println("No se encontró una reserva para ese vehículo");
            return;
        }

        System.out.print("Kms recorridos: ");
        int kmsRecorridos = Integer.parseInt(scanner.nextLine());
        double precio = empresa.devolverVehiculo(reserva, kmsRecorridos);
        System.out.println("Vehículo devuelto con éxito");
        System.out.println("Precio total a cobrar: " + precio);
    }
}
