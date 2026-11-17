public class Inventario {
    public static int calcularResta(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int numero1 = 85;
        int numero2 = 27;
        int resultado = calcularResta(numero1, numero2);
        System.out.println("Resultado de la resta: " + resultado);
    }
}