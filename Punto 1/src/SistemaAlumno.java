import java.util.ArrayList;

public class SistemaAlumno {
    private ArrayList<Alumno> listaAlumnos;

    
    public SistemaAlumno() {
        this.listaAlumnos=new ArrayList<Alumno>();
    }


    public void addAlumno(Alumno alumno){
        this.listaAlumnos.add(alumno);
        System.out.println("el alumno fue agregado");
    }

    public void asignarCalificaciones(Alumno alumno,Float calificacion){

        listaAlumnos.get(verificacionAlumno(alumno)).setCalificaciones(calificacion);
    }

    public void calcularPromedio(Alumno alumno){
        Float promedio=0F;
        ArrayList<Float> calificacioneslista=new ArrayList<Float>();
        calificacioneslista= listaAlumnos.get(verificacionAlumno(alumno)).getCalificaciones();
        for (int i = 0; i < calificacioneslista.size(); i++) {
            promedio=promedio+calificacioneslista.get(i);
        }
        promedio=promedio/calificacioneslista.size();
        System.out.println("El promedio de: "+alumno.getNombre()+" es: "+promedio);
    }

    /*verificamos que el alumno si este y el lugar */
    public int verificacionAlumno(Alumno alumno){

        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (alumno==listaAlumnos.get(i)) {
                return i;
            }
        }
        System.out.println("no se encontro el alumno");
        return -1;
    }


    @Override
    public String toString() {
        return "SistemaAlumno [listaAlumnos=" + listaAlumnos + "]";
    }
    
}
