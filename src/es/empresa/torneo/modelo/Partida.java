public class Partida {

    private int codPartida;
    private Torneo nombreTorneo;
    private String nombreEquipo1;
    private String nombreEquipo2;
    private LocalDate fechaPartida;
    private String resultado;

    public Partida(int codPartida, Torneo nombreTorneo, String nombreEquipo1, String nombreEquipo2, LocalDate fechaPartida, String resultado) {
        this.codPartida = codPartida;
        this.nombreTorneo = nombreTorneo;
        this.nombreEquipo1 = nombreEquipo1;
        this.nombreEquipo2 = nombreEquipo2;
        this.fechaPartida = fechaPartida;
        this.resultado = resultado;
    }

    public int getCodPartida() {
        return codPartida;
    }
    public void setCodPartida(int codPartida) {
        this.codPartida = codPartida;
    }
    public Torneo getNombreTorneo() {
        return nombreTorneo;
    }
    public void setNombreTorneo(Torneo nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }
    public String getNombreEquipo1() {
        return nombreEquipo1;
    }
    public void setNombreEquipo1(String nombreEquipo1) {
        this.nombreEquipo1 = nombreEquipo1;
    }
    public String getNombreEquipo2() {
        return nombreEquipo2;
    }
    public void setNombreEquipo2(String nombreEquipo2) {
        this.nombreEquipo2 = nombreEquipo2;
    }
    public LocalDate getFechaPartida() {
        return fechaPartida;
    }
    public void setFechaPartida(LocalDate fechaPartida) {
        this.fechaPartida = fechaPartida;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void registrarResultado(String resultado) {
    }

    public void registrarEquipoGanador(String nombreEquipo1) {
    }
}