public class Equipo {

    private String nombre;
    private String fichaEquipo;
    private String procedencia;
    private int numeroVictorias;
    private int numeroDerrotas;
    private int numeroEmpates;
    private int numeroPartidasJugadas;
    private List<Jugador> jugadores;

    public Equipo(String nombre, String fichaEquipo, String procedencia, int numeroVictorias, int numeroDerrotas, int numeroEmpates, int numeroPartidasJugadas, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.fichaEquipo = fichaEquipo;
        this.procedencia = procedencia;
        this.numeroVictorias = numeroVictorias;
        this.numeroDerrotas = numeroDerrotas;
        this.numeroEmpates = numeroEmpates;
        this.numeroPartidasJugadas = numeroPartidasJugadas;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFichaEquipo() {
        return fichaEquipo;
    }
    public void setFichaEquipo(String fichaEquipo) {
        this.fichaEquipo = fichaEquipo;
    }
    public String getProcedencia() {
        return procedencia;
    }
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    public int getNumeroVictorias() {
        return numeroVictorias;
    }
    public void setNumeroVictorias(int numeroVictorias) {
        this.numeroVictorias = numeroVictorias;
    }
    public int getNumeroDerrotas() {
        return numeroDerrotas;
    }
    public void setNumeroDerrotas(int numeroDerrotas) {
        this.numeroDerrotas = numeroDerrotas;
    }
    public int getNumeroEmpates() {
        return numeroEmpates;
    }
    public void setNumeroEmpates(int numeroEmpates) {
        this.numeroEmpates = numeroEmpates;
    }
    public int getNumeroPartidasJugadas() {
        return numeroPartidasJugadas;
    }
    public void setNumeroPartidasJugadas(int numeroPartidasJugadas) {
        this.numeroPartidasJugadas = numeroPartidasJugadas;
    }
    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void agregarJugador(Jugador jugador) {
    }
    public void eliminarugador() {
    }
    public void mostrarFichaEquipo(String nombre) {
    }
}