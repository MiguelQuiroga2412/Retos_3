package POO.Reto_1.principal;

import POO.Reto_1.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.pedirDatos();
        persona1.mostrarPersona();
        persona1.calcularImc();
        persona1.mayorEdad();
    }
}