package ar.edu.undec.plantas.controller.dtomodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlantaDTO {

    @JsonProperty("nombrecientifico")
    private String nombrecientifico;
    @JsonProperty("nombrevulgar")
    private String nombrevulgar;
    @JsonProperty("categoria")
    private String categoria;
    @JsonProperty("epocaplantado")
    private String epocaplantado;
    @JsonProperty("alturamaxima")
    private Integer alturamaxima;

    public PlantaDTO(String nombrecientifico,
                     String nombrevulgar,
                     String categoria,
                     String epocaplantado,
                     Integer alturamaxima) {
        this.nombrecientifico = nombrecientifico;
        this.nombrevulgar = nombrevulgar;
        this.categoria = categoria;
        this.epocaplantado = epocaplantado;
        this.alturamaxima = alturamaxima;
    }

    public String getNombrecientifico() {
        return nombrecientifico;
    }

    public String getNombrevulgar() {
        return nombrevulgar;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getEpocaplantado() {
        return epocaplantado;
    }

    public Integer getAlturamaxima() {
        return alturamaxima;
    }
}
