import java.time.LocalDate;
import java.util.ArrayList;

public class App4 {
    public static void main(String[] args) throws Exception {
        /* Hotel, Habitación, Cliente, y Reserva. */

        /*creamos los clientes */
        Cliente cliente1=new Cliente("cristian","123456789" );
        Cliente cliente2= new Cliente("camilo", "78945613");

        /*creamos dos habitaciones */
        ArrayList<Habitacion> listaHabitaciones=new ArrayList<Habitacion>();
        Habitacion habitacion1=new Habitacion("568");
        Habitacion habitacion2=new Habitacion("879");
        listaHabitaciones.add(habitacion1);
        listaHabitaciones.add(habitacion2);
        
        

        /*creamos el hotel */
        Hotel hotel=new Hotel("hotel bueno", listaHabitaciones);

        /*hacemos una reserva */
        Reserva reserva =new Reserva(hotel);

        LocalDate fecha1 = LocalDate.of(2023, 8, 7);
        LocalDate fecha2 = LocalDate.of(2023, 8, 8);
        reserva.agendarHabitacion(fecha1,habitacion1);
        System.out.println("-----------------------------");
        reserva.agendarHabitacion(fecha2, habitacion2);
        System.out.println("-----------------------------");
        reserva.agendarHabitacion(fecha1, habitacion1);
        System.out.println("-----------------------------");
        reserva.mostrarReserva();
    }
}
