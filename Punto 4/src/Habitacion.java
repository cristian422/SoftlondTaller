import java.time.LocalDate;
import java.util.ArrayList;
public class Habitacion {
    String numeroHabitacion;
    Cliente cliente;
    ArrayList<LocalDate> fechasReservadas;


    public Habitacion(String numeroHabitacion) {
        this.cliente=null;
        this.numeroHabitacion=numeroHabitacion;
        
        this.fechasReservadas = new ArrayList<LocalDate>();
    }
    

    public void confirmarFecha(LocalDate fecha){
        if (fechasReservadas.contains(fecha)) {
            System.out.println("La habitación ya está reservada para la fecha: " + fecha);
        } else {
            fechasReservadas.add(fecha);
            System.out.println("Habitación agendada para la fecha: " + fecha);
        }
    }


    @Override
    public String toString() {
        return "Habitacion [numeroHabitacion=" + numeroHabitacion + ", cliente=" + cliente + ", fechasReservadas="
                + fechasReservadas + "]";
    }
    
}
