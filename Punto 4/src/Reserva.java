import java.time.LocalDate;

public class Reserva {
    Hotel hotel;
    
    public Reserva(Hotel hotel) {
        this.hotel = hotel;
        
    }

    public void agendarHabitacion(LocalDate fecha,Habitacion habitacion) {
        int confirmacion=hotel.confirmarHabitacion(habitacion);
        if(confirmacion>=0){
            hotel.habitaciones.get(confirmacion).confirmarFecha(fecha);
        }

    }
    public void mostrarReserva(){
        System.out.println("el nombre del hotel es: "+hotel.nombreHotel);
        System.out.println("fecha: "+hotel.habitaciones);
    }

    @Override
    public String toString() {
        return "Reserva [hotel=" + hotel.toString() ;
    }

    

    
}


