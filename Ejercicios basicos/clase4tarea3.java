import java.util.Scanner;
public class clase4tarea3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int num = n.nextInt();
        System.out.println("El factorial de " + num + " es " + calcularFactorial(num));
    }
    public static int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}