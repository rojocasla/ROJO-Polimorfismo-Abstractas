package Package;

/**
 *
 * @author estudiante
 */
public abstract class Figura {
    
    protected int cantlado;

    public Figura(int cantlado) {
        this.cantlado = cantlado;
    }
    
    public abstract void calcularArea(int ladoCm);
    
}