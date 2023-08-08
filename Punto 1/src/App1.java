public class App1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        /*creamos a los alumnos */
        Alumno alumno1=new Alumno("cristian", 23);
        Alumno alumno2=new Alumno("camilo", 20);
        Alumno alumno3=new Alumno("Danny", 18);


        /*se crea el sistema alumno vacio y se le agregan los alumnos */
        SistemaAlumno sistemaAlumno=new SistemaAlumno();
        sistemaAlumno.addAlumno(alumno1);
        sistemaAlumno.addAlumno(alumno2);
        sistemaAlumno.addAlumno(alumno3);

        sistemaAlumno.asignarCalificaciones(alumno3, 7F);
        sistemaAlumno.asignarCalificaciones(alumno3, 6F);

        sistemaAlumno.calcularPromedio(alumno3);
        System.out.println(sistemaAlumno.toString());;
    }
}
