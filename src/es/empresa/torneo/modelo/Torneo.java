public class Torneo {

    private String nombre;
    private String direccion;
    private LocalDate fecha;
    private List<Equipo> equipos;

    public Torneo(String nombre, String direccion, String fecha) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fecha = fecha;
        this.equipos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public List<Equipo> getEquipos() {
        return equipos;
    }


    public void agregarEquipo(Equipo equipo) {
    }

    public void eliminarEquipo(Equipo equipo) {
    }
}