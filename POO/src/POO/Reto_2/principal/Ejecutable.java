package POO.Reto_2.principal;
import POO.Reto_2.Salud.persona;

public class Ejecutable {
    public static void main(String[] args) {
        persona persona = new persona();
        persona.pedirDatos();
        persona.mostrarPersona();
        double estatura=0,peso=0;
        double imc=persona.calcularImc(peso,estatura);
        persona.mayorEdad();
        System.out.println(imc);
    }
}
