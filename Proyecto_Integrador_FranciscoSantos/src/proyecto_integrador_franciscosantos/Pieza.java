
package proyecto_integrador_franciscosantos;


public class Pieza {
    private boolean acceso;

    public Pieza() {
    }

    public Pieza(boolean acceso) {
        this.acceso = acceso;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    @Override
    public String toString() {
        return "Pieza{" + "acceso=" + acceso + '}';
    }
    
    
}
