package ar.edu.undec.computadoras.controller.dtomodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ComputadoraDTO {

    @JsonProperty("codigo")
    private String codigo;
    @JsonProperty("procesador")
    private String procesador;
    @JsonProperty("almacenamiento")
    private Integer almacenamiento;
    @JsonProperty("tipoalmacenamiento")
    private String tipoalmacenamiento;
    @JsonProperty("ram")
    private Integer ram;
    @JsonProperty("tipomaquina")
    private String tipomaquina;

    public ComputadoraDTO(@JsonProperty("codigo") String codigo,
                          @JsonProperty("procesador") String procesador,
                          @JsonProperty("almacenamiento") Integer almacenamiento,
                          @JsonProperty("tipoalmacenamiento") String tipoalmacenamiento,
                          @JsonProperty("ram") Integer ram,
                          @JsonProperty("tipomaquina") String tipomaquina) {
        this.codigo = codigo;
        this.procesador = procesador;
        this.almacenamiento = almacenamiento;
        this.tipoalmacenamiento = tipoalmacenamiento;
        this.ram = ram;
        this.tipomaquina = tipomaquina;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProcesador() {
        return procesador;
    }

    public Integer getAlmacenamiento() {
        return almacenamiento;
    }

    public String getTipoalmacenamiento() {
        return tipoalmacenamiento;
    }

    public Integer getRam() {
        return ram;
    }

    public String getTipomaquina() {
        return tipomaquina;
    }
}
