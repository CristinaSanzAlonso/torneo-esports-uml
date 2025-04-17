public class Jugador {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private int dni;
    private Equipo nombreEquipo;

    public Jugador(String nombre, String apellido1, String apellido2, int dni, Equipo nombreEquipo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public int getDni() {
        return Dni;
    }
    public void setDni(int dni) {
        Dni = dni;
    }
    public Equipo getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(Equipo nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void actualizarDatos(String nombre, String apellido1, String apellido2, int dni, Equipo nombreEquipo) {
    }
    public void consultarFicha(String dni) {
    }
}