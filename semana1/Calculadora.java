import java.util.Scanner;

public class Calculadora {

    // Módulo Calculadora
    public static void mostrarMenu() {
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División (sin residuo)");
        System.out.println("5. División (con residuo)");
        System.out.println("6. Salir");
    }

    public static void realizarOperacion(int opcion) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        switch (opcion) {
            case 1: // Suma
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextDouble();
                System.out.println("Resultado de la suma: " + (num1 + num2));
                break;
            case 2: // Resta
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextDouble();
                System.out.println("Resultado de la resta: " + (num1 - num2));
                break;
            case 3: // Multiplicación
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextDouble();
                System.out.println("Resultado de la multiplicación: " + (num1 * num2));
                break;
            case 4: // División sin residuo
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    System.out.println("Resultado de la división: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            case 5: // División con residuo
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    System.out.println("Resultado de la división (sin residuo): " + (num1 / num2));
                    System.out.println("Residuo: " + (num1 % num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            case 6: // Salir
                System.out.println("Saliendo de la calculadora...");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    // Módulo Convertidor de Unidades
    public static void mostrarMenuUnidades() {
        System.out.println("Seleccione una conversión de unidades:");
        System.out.println("1. Longitud (metros a centímetros e pulgadas)");
        System.out.println("2. Masa (kilogramos a libras y gramos)");
        System.out.println("3. Velocidad (metros/segundo a kilómetros/hora)");
        System.out.println("4. Salir");
    }

    public static void realizarConversion(int opcion) {
        Scanner scanner = new Scanner(System.in);
        double valor;

        switch (opcion) {
            case 1: // Longitud
                System.out.println("Ingrese la cantidad en metros:");
                valor = scanner.nextDouble();
                System.out.println("En centímetros: " + (valor * 100));
                System.out.println("En pulgadas: " + (valor * 39.3701));
                break;
            case 2: // Masa
                System.out.println("Ingrese la cantidad en kilogramos:");
                valor = scanner.nextDouble();
                System.out.println("En libras: " + (valor * 2.20462));
                System.out.println("En gramos: " + (valor * 1000));
                break;
            case 3: // Velocidad
                System.out.println("Ingrese la velocidad en metros/segundo:");
                valor = scanner.nextDouble();
                System.out.println("En kilómetros/hora: " + (valor * 3.6));
                break;
            case 4: // Salir
                System.out.println("Saliendo del convertidor de unidades...");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionCalculadora, opcionConvertidor;

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calculadora");
            System.out.println("2. Convertidor de unidades");
            System.out.println("3. Salir");
            int opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1: // Calculadora
                    while (true) {
                        mostrarMenu();
                        opcionCalculadora = scanner.nextInt();
                        if (opcionCalculadora == 6) break;
                        realizarOperacion(opcionCalculadora);
                    }
                    break;
                case 2: // Convertidor de unidades
                    while (true) {
                        mostrarMenuUnidades();
                        opcionConvertidor = scanner.nextInt();
                        if (opcionConvertidor == 4) break;
                        realizarConversion(opcionConvertidor);
                    }
                    break;
                case 3: // Salir
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
