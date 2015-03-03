package Boletin19;

/**
 * ** @author dpazolopez ***
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import java.util.Iterator;

/**
 * ** @author dpazolopez ***
 */
public class Buzon {

    ArrayList<Correo> correo = new ArrayList<>();
    private Object email;

        public Buzon() {
        }

        public void numCorreos() {
            int tam = correo.size();
            System.out.println("Correos: " + tam);
        }

        public void add() {
            String cont = JOptionPane.showInputDialog("Contenido: ");
            correo.add(new Correo(cont, 1));
        }

        public void porLeer() {
            int l;
            int n = 0;
            for (Correo ex : correo) {
                l = ex.getLeido();
                n += l;
            }
            System.out.println("Quedan " + n + " correos por leer");
        }

        public void primerNoLeido() {
            String c;
            int aux = 0;
            for (Correo ex : correo) {
                if (ex.getLeido() != 0) {
                    c = ex.getContenido();
                    System.out.println(c);
                    ex.setLeido(0);
                    aux = 1;
                    break;
                } else {
                    aux = 0;
                }
            }
            if (aux == 0) {
                System.out.println("No quedan correos por leer");
            }
        }

        public void mostrar() {
            int p = Integer.parseInt(JOptionPane.showInputDialog("Posición: "));
            String m = correo.get(p).getContenido();
            System.out.println(m);
            correo.get(p).setLeido(0);
        }

        public void delete() {
            int p = Integer.parseInt(JOptionPane.showInputDialog("Posición: "));
            correo.remove(p);
        }

        public int menu() {
            /*int op = Integer.parseInt(JOptionPane.showInputDialog(
             "**** MENÚ***\n"
             + "1-> Crear Correo\n"
             + "2-> Número de correos\n"
             + "3-> Mostrar(posición)\n"
             + "4-> Mostrar primero sin leer\n"
             + "5-> Quedan correos por leer\n"
             + "6-> Borrar correo\n"
             + "7-> Salir"));
             */
            int op = JOptionPane.showOptionDialog(
                    null, "Selecciona una opción", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                        "Crear Correo",
                        "Número de correos",
                        "Mostrar(posición)",
                        "Mostrar primero sin leer",
                        "Correos por leer",
                        "Borrar correo",
                        "Exit"},
                    "Exit");
            return op + 1;
        }
    

    public void ordearReves() {
        Comparator<Buzon> comp = Collections.reverseOrder();
    }

    public void ordear() {
        Collections.sort(correo, null);
    }

    /*public int compareTo(Object o) {

        Buzon al = (Buzon) o;
        if (email.compareToIgnoreCase(correo.) == 0) {
            if(email.compareToIgnoreCase())
            return 0;
        } else if (this.email.compareToIgnoreCase(correo.email) > 0) {
            return 1;
        } else {
            return -1;
        }
    }*/
}
