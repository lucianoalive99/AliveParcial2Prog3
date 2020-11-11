package ar.edu.undec.computadoras.core.dominio;

public class Computadora {


    private String resumen;
    private String procesador;
    private Integer almacenamiento;
    private String tipoalmacenamiento;
    private Integer ram;
    private String tipomaquina;



    public static Computadora instancia(String resumen, String procesador, Integer almacenamiento,
                                 String tipoalmacenamiento, Integer ram, String tipomaquina) {
        return new Computadora(resumen,procesador,almacenamiento,tipoalmacenamiento,ram,tipomaquina);
    }

    public Computadora(String resumen, String procesador, Integer almacenamiento, String tipoalmacenamiento, Integer ram, String tipomaquina) {
        this.resumen = resumen;
        this.procesador = procesador;
        this.almacenamiento = almacenamiento;
        this.tipoalmacenamiento = tipoalmacenamiento;
        this.ram = ram;
        this.tipomaquina = tipomaquina;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Integer getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(Integer almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoalmacenamiento() {
        return tipoalmacenamiento;
    }

    public void setTipoalmacenamiento(String tipoalmacenamiento) {
        this.tipoalmacenamiento = tipoalmacenamiento;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getTipomaquina() {
        return tipomaquina;
    }

    public void setTipomaquina(String tipomaquina) {
        this.tipomaquina = tipomaquina;
    }
}
