package Package;

/**
 *
 * @author estudiante
 */
public class Circulo {
    
    private int diametro;
    private int radio;

    public Circulo(int diametro, int radio) {
        this.diametro = diametro;
        this.radio = radio;
    }
   
    public void calcularAreaCirculo(int radio){
        
        System.out.println("Area: "+ (3.14159 * (radio*radio)));
        System.out.println("Circunferencia: " +  2* 3.14159 * radio);
        
    }    
}
