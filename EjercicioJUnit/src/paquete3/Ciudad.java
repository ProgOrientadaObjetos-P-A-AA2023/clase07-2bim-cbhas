package paquete3;

public class Ciudad {

    private String nombre;
    private int poblacion;

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public int obtenerPoblacion() {
        return poblacion;
    }

    public void establecerPoblacion(int p) {
        poblacion = p;
    }

    @Override
    public String toString() {
        return String.format("Ciudad de Ecuador\n Nombre: %s\n\n\t"
                + "Población: %d\n",
                nombre,
                poblacion);
    }

}
