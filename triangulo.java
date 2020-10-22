import java.util.Scanner;

public class triangulo {
    
    public static void main(String[] args) {

        double Area;
        double Base;
        double Altura;

        Scanner A = new Scanner(System.in);
        Scanner B = new Scanner(System.in);

        System.out.println("Introduce la altura");
        Altura = A.nextDouble();

        System.out.println("Introduce la base");
        Base = B.nextDouble();

        Area = (Base * Altura)/2;

        System.out.println("El area es: "+Area);
    }
}
