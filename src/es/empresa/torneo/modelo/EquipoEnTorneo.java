public class EquipoEnTorneo {

    private String nombreEquipo;
    private String nombreTorneo;

    public EquipoEnTorneo(String nombreEquipo, String nombreTorneo) {
        this.nombreEquipo = nombreEquipo;
        this.nombreTorneo = nombreTorneo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public String getNombreTorneo() {
        return nombreTorneo;
    }
    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }
}