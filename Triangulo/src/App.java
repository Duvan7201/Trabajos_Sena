public class App {

    public static String determinarTriangulo(double lado1, double lado2, double lado3) {

        if (lado1 == lado2 && lado2 == lado3) {
            return "El triángulo es equilátero";
        } 
        else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            return "El triángulo es escaleno";
        } 
        else {
            return "El triángulo es rectángulo";
        }
    }

    public static void main(String[] args) {

        double lado1 = 5;
        double lado2 = 5;
        double lado3 = 5;

        String resultado = determinarTriangulo(lado1, lado2, lado3);

        System.out.println(resultado);
    }
}
