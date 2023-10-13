package pokemon;


public class Movimiento {
    private String nombre;
    private int puntosDeataque;
    private int pp;
    private Tipo tipo;

    public Movimiento(String nombre, int puntosDeataque, Tipo tipo, int pp) {
        this.nombre = nombre;
        this.puntosDeataque = puntosDeataque;
        this.pp = pp;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeataque() {
        return puntosDeataque;
    }

    public int getPp() {
        return pp;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
    
    
    
}
