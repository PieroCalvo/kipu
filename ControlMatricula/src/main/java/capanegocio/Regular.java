package capanegocio;

public class Regular extends Alumno{
    private String ciclo;
    private String creditos;
    private String promedioSem;

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getPromedioSem() {
        return promedioSem;
    }

    public void setPromedioSem(String promedioSem) {
        this.promedioSem = promedioSem;
    }
}
