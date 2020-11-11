package ar.edu.undec.computadoras.core.dominio;

import ar.edu.undec.computadoras.controller.dtomodel.ComputadoraDTO;

public class Computadora {


    private String codigo;
    private String procesador;
    private Integer almacenamiento;
    private String tipoalmacenamiento;
    private Integer ram;
    private String tipomaquina;

    public Computadora() {

    }


    public static Computadora instancia(String codigo, String procesador, Integer almacenamiento,
                                 String tipoalmacenamiento, Integer ram, String tipomaquina) {
        return new Computadora(codigo,procesador,almacenamiento,tipoalmacenamiento,ram,tipomaquina);
    }

    public Computadora(String codigo, String procesador, Integer almacenamiento, String tipoalmacenamiento, Integer ram, String tipomaquina) {
        this.codigo = codigo;
        this.procesador = procesador;
        this.almacenamiento = almacenamiento;
        this.tipoalmacenamiento = tipoalmacenamiento;
        this.ram = ram;
        this.tipomaquina = tipomaquina;
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
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

    public static Computadora computadoraDTOtoMascota(ComputadoraDTO laComputadorDTO) {
        Computadora computadora = new Computadora();

        computadora.setcodigo(laComputadorDTO.getCodigo());
        computadora.setProcesador(laComputadorDTO.getProcesador());
        computadora.setAlmacenamiento(laComputadorDTO.getAlmacenamiento());
        computadora.setTipoalmacenamiento(laComputadorDTO.getTipoalmacenamiento());
        computadora.setRam(laComputadorDTO.getRam());
        computadora.setTipomaquina(laComputadorDTO.getTipomaquina());

        return computadora;
    }
}
