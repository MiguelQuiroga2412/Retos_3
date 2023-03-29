package POO.Reto_3.Salud;

import java.util.Scanner;

public class Empleado extends Persona {
    private String Cargo;
    private Double valorHora;
    private Double horasTrabajadas;
    private String departamento;

    public Empleado(String tipoDoc,String documento,String nombre,String apellido,double peso,double estatura,int edad,char sexo,String Cargo,Double valorHora,Double horasTrabajadas,String departamento) {
        super(tipoDoc,documento,nombre,apellido,peso,estatura,edad,sexo);
        this.Cargo=Cargo;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.departamento=departamento;
    }
    double Total=0;
    public void calcularHonorarios() {
        Double reteica=0.966;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese El cargo Actual");
        Cargo=lectura.nextLine();
        System.out.println("Ingrese el valor por cada hora");
        valorHora=lectura.nextDouble();
        System.out.println("Ingrese la cantidad de horas trabajadas");
        horasTrabajadas=lectura.nextDouble();
        System.out.println("Ingrese su departamento");
        departamento=lectura.nextLine();
        Total=horasTrabajadas*valorHora-reteica;
        lectura.close();
    }
    public void MostrarHonorarios() {
        System.out.println("El tipo de documento es: "+getTipoDoc());
        System.out.println("El numero de documento es: "+getDocumento());
        System.out.println("Su nombre es: "+getNombre());
        System.out.println("Su apellido es: "+getApellido());
        System.out.println("cargo: "+Cargo);
        System.out.println("Horas trabajadas: "+horasTrabajadas);
        System.out.println("Valor Hora: "+valorHora);
        System.out.println("Total a pagar: "+Total);
        System.out.println("Departamento: "+departamento);
        
    }

}
