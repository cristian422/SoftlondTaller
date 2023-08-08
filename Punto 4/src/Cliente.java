public class Cliente {
    public Cliente(String string, String string2) {
    }
    String nombre;
    String cedula;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", cedula=" + cedula + "]";
    }
    
}
