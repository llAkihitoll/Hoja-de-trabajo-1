import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Licuadora licuadora = new LicuadoraEnSi();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\nMenu de la Licuadora:");
            System.out.println("1. Encender");
            System.out.println("2. Apagar");
            System.out.println("3. Llenar");
            System.out.println("4. Subir velocidad");
            System.out.println("5. Bajar velocidad");
            System.out.println("6. Ver velocidad");
            System.out.println("7. Ver si está llena");
            System.out.println("8. Vaciar");
            System.out.println("9. Servir");
            System.out.println("0. Salir");
            System.out.print("Escoge una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    licuadora.encender();
                    System.out.println("Licuadora encendida.");
                    break;
                case 2:
                    licuadora.apagar();
                    System.out.println("Licuadora apagada.");
                    break;
                case 3:
                    System.out.print("Ingresa el peso a agregar (en gramos): ");
                    double gramos = scanner.nextDouble();
                    double resultadoLlenar = licuadora.llenar(gramos);
                    if (resultadoLlenar == -1) {
                        System.out.println("Error: el peso debe ser mayor a 0 gramos.");
                    } else if (resultadoLlenar == -2) {
                        System.out.println("Error: no se puede agregar, se pasa de la capacidad máxima.");
                    } else {
                        System.out.println("Peso actual en la licuadora: " + resultadoLlenar + " gramos.");
                    }
                    break;
                case 4:
                    int resultadoIncrementar = licuadora.incrementarVelocidad();
                    if (resultadoIncrementar == -1) {
                        System.out.println("Error: la licuadora esta apagada.");
                    } else if (resultadoIncrementar == -2) {
                        System.out.println("Error: ya esta en la velocidad máxima.");
                    } else {
                        System.out.println("Velocidad subida a: " + resultadoIncrementar);
                    }
                    break;
                case 5:
                    int resultadoDecrementar = licuadora.decrementarVelocidad();
                    if (resultadoDecrementar == -1) {
                        System.out.println("Error: la licuadora esta apagada.");
                    } else if (resultadoDecrementar == -2) {
                        System.out.println("Error: ya esta en la velocidad mínima.");
                    } else {
                        System.out.println("Velocidad bajada a: " + resultadoDecrementar);
                    }
                    break;
                case 6:
                    System.out.println("Velocidad actual: " + licuadora.consultarVelocidad());
                    break;
                case 7:
                    System.out.println("¿Está llena? " + (licuadora.estarLlena() ? "Sí" : "No"));
                    break;
              
