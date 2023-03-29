package POO.Reto_4;

public class triangulo extends figura {
    private float base;
    private float altura;
    public triangulo(float base,float altura) {
        this.base=base;
        this.altura=altura;
    }
  
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void calcularArea() {
        float area = base*altura;
        System.out.println("La base de el triangulo es"+base+"Su altura es"+altura+"y su area es"+area);
    }
   
}
