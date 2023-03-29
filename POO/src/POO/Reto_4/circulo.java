package POO.Reto_4;
 

public class circulo extends figura{
    private Double radio;
    private Double pi=3.1416;
    public circulo(Double radio, Double pi) {
        this.radio = radio;
        this.pi = pi;
    }
    public void calcularArea() {
        Double area =(radio*2)*pi;
        System.out.println("el area de su circulo es: "+area);
    }
   
}
