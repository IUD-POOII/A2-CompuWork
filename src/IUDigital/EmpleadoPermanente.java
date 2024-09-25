package IUDigital;

public class EmpleadoPermanente {
    private int antiguedad;
    private String beneficios;

    public EmpleadoPermanente() {
    }
    public EmpleadoPermanente(int antiguedad, String beneficios) {
        this.antiguedad = antiguedad;
        this.beneficios = beneficios;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
}
