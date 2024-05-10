public class clase4tarea2 {
    public static void main(String[] args)throws Exception{
        Operaciones(8, 2);
    }
    public static void Operaciones(int a, int b) {
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;

        System.out.println("La suma de " + a + " + " + b + " es = " + suma);
        System.out.println("La resta de " + a + " - " + b + " es = " + resta);
        System.out.println("La multiplicación de " + a + " * " + b + " es = " + multiplicacion);
        System.out.println("La división de " + a + " / " + b + " es = " + division);
    }
}