package POO.Reto_3.Salud;

import java.util.Scanner;

public class Persona {
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private char sexo;
    public void pedirDatos() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el tipo de documento: ");
        tipoDoc = lectura.nextLine();
        System.out.println("Ingrese el número de documento: ");
        documento = lectura.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre = lectura.nextLine();
        System.out.println("Ingrese el apellido: ");
        apellido = lectura.nextLine();
        System.out.println("Ingrese el peso en kg: ");
        peso = Double.parseDouble(lectura.nextLine());
        System.out.println("Ingrese la estatura en m: ");
        estatura = Double.parseDouble(lectura.nextLine());
        System.out.println("Ingrese la edad: ");
        edad = Integer.parseInt(lectura.nextLine());
        System.out.println("Ingrese el sexo (M o F): ");
        sexo = lectura.nextLine().charAt(0);
        lectura.close();
    }
    public void mostrarPersona() {
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }
    public void calcularImc() {
        double imc = peso / (estatura * estatura);
        if (imc < 20) {
            System.out.println("PESOBAJO"); 
        } else if (imc <= 25 && imc>=20) {
            System.out.println("PESOBAJO"); 
        } else {
            System.out.println("PESOBAJO"); 
        }
    }
    public void mayorEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " es menor de edad");
        }
    }
    public Persona() {
        
    }
    public Persona(String tipoDoc2, String documento2, String nombre2, String apellido2, double peso2, double estatura2,
            int edad2, char sexo2) {
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
