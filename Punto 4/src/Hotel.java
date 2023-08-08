import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    String nombreHotel;
    ArrayList<Habitacion> habitaciones;
    

    public Hotel(String nombreHotel, ArrayList<Habitacion> habitaciones) {
        this.nombreHotel = nombreHotel;
        this.habitaciones = habitaciones;
        
    }

    
    public int confirmarHabitacion(Habitacion habitacion){
        if (habitaciones.contains(habitacion)) {
            
            for (int i = 0; i < habitaciones.size(); i++) {
                Habitacion habitacion2=habitaciones.get(i);
                if (habitacion==habitacion2) {
                    System.out.println("la habitacion si existe");
                    return i;
                }
            }
        }
        System.out.println("la habitacion no existe");
        return -1;
    }


    @Override
    public String toString() {
        return "Hotel [nombreHotel=" + nombreHotel.toString() + ", habitaciones=" + habitaciones.toString() + "]";
    }
    


}
