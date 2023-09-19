package Package;

/**
 *
 * @author estudiante
 */
public class Cuadrado extends Figura {
    
    private int ladoCm;
    
    public Cuadrado(int ladoCm, int cantlado) {   
        super(cantlado);
        this.ladoCm = ladoCm;
    }

    @Override
    public void calcularArea(int ladoCm) {
        System.out.println("Area: "+ ladoCm);
    }
}
