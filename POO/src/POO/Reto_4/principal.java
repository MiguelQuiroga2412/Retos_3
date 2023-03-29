package POO.Reto_4;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        float base,altura;
        double radio,pi=3.1416;
        System.out.println("Ingrese el valor de la base del triangulo");
        base=lectura.nextFloat();
        System.out.println("Ingrese la altura del triangulo");
        altura=lectura.nextFloat();
        triangulo c1=new triangulo(base,altura);
        c1.calcularArea();
        System.out.println("Ingrese el valor de la base del rectangulo");
        base=lectura.nextFloat();
        System.out.println("Ingrese la altura del rectangulo");
        altura=lectura.nextFloat();
        rectangulo r1=new rectangulo(base,altura);
        r1.calcularArea();
        System.out.println("Ingrese el valor del radio de el circulo");
        radio=lectura.nextDouble();
        circulo r2=new circulo(radio,pi);
        r2.calcularArea();
        lectura.close();
        
        }
    }

