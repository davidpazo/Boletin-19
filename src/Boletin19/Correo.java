package Boletin19;

/**
 * ** @author dpazolopez ***
 */
public class Correo {

    private String email;
    private int leido;

    public Correo() {
    }

    public Correo(String contenido, int leido) {
        this.email = contenido;
        this.leido = leido;
    }

    public String getContenido() {
        return email;
    }

    public void setContenido(String contenido) {
        this.email = contenido;
    }

    public int getLeido() {
        return leido;
    }

    public void setLeido(int leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Correo{" + "contenido=" + email + ", leido=" + leido + '}';
    }
}
