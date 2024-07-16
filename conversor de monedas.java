import java.util.Scanner; //importar clase scanner

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("CONVERSOR DE MONEDAS MERCOSUR A U$D");
            System.out.println("1 - Pesos argentinos a dolares\n"
                    + "2 - Pesos bolivianos a dolares\n"
                    + "3 - Reales a dolares\n"
                    + "4 - Guaranies a dolares\n"
                    + "5 - Bolivares venezolanos a dolares\n"
                    + "6 - Pesos uruguayos a dolares\n"
                    + "7 - Salir");

            System.out.println("Ingresa una opcion:");
            char opcion = sc.next().charAt(0);

            switch (opcion) {
                case '1':
                    convertir(922.24, "Pesos argentinos", sc);
                    break;
                case '2':
                    convertir(6.91, "Pesos bolivianos", sc);
                    break;
                case '3':
                    convertir(5.44, "Reales", sc);
                    break;
                case '4':
                    convertir(7534, "Guaranies", sc); // Valor correcto para Guaranies
                    break;
                case '5':
                    convertir(36.48, "Bolivares venezolanos", sc);
                    break;
                case '6':
                    convertir(40.04, "Pesos uruguayos", sc);
                    break;
                case '7':
                    System.out.println("Cerrando convertidor");
                    return;
                default:
                    System.out.println("¡Opción incorrecta!");
            }
        }
    }

    static void convertir(double valorDolar, String pais, Scanner sc) {
        System.out.printf("Ingresa la cantidad de %s: ", pais);
        double cantidadMoneda = sc.nextDouble();

        double dolares = cantidadMoneda / valorDolar;
        dolares = (double) Math.round(dolares * 100d) / 100;

        System.out.println("Son " + dolares + " dolares");
    }
}
