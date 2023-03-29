package POO.Reto_3.principal;
import POO.Reto_3.Salud.Empleado;

public class Ejecutar {
    public static void main(String[] args) {
        Empleado persona1 = new Empleado(null, null, null, null, 0, 0, 0, (char) 0, null, null, null, null);
        persona1.pedirDatos();
        persona1.calcularHonorarios();
        persona1.MostrarHonorarios();
        
    }
}