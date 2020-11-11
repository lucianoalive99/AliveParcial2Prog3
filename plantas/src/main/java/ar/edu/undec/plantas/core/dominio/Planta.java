package ar.edu.undec.plantas.core.dominio;

import ar.edu.undec.plantas.controller.dtomodel.PlantaDTO;

public class Planta {


    private String nombrecientifico;
    private String nombrevulgar;
    private String categoria;
    private String epocaplantado;
    private Integer alturamaxima;

    public Planta() {
    }

    public Planta(String nombrecientifico, String nombrevulgar, String categoria, String epocaplantado, Integer alturamaxima) {
        this.nombrecientifico = nombrecientifico;
        this.nombrevulgar = nombrevulgar;
        this.categoria = categoria;
        this.epocaplantado = epocaplantado;
        this.alturamaxima = alturamaxima;
    }

    public static Planta instancia(String nombrecientifico,
                                   String nombrevulgar,
                                   String categoria,
                                   String epocaplantado,
                                   Integer alturamaxima) {
        return new Planta(nombrecientifico,nombrevulgar,categoria,epocaplantado,alturamaxima);

    }



    public String getNombrecientifico() {
        return nombrecientifico;
    }

    public void setNombrecientifico(String nombrecientifico) {
        this.nombrecientifico = nombrecientifico;
    }

    public String getNombrevulgar() {
        return nombrevulgar;
    }

    public void setNombrevulgar(String nombrevulgar) {
        this.nombrevulgar = nombrevulgar;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEpocaplantado() {
        return epocaplantado;
    }

    public void setEpocaplantado(String epocaplantado) {
        this.epocaplantado = epocaplantado;
    }

    public Integer getAlturamaxima() {
        return alturamaxima;
    }

    public void setAlturamaxima(Integer alturamaxima) {
        this.alturamaxima = alturamaxima;
    }

    public static Planta PlantaDTOtoPlanta(PlantaDTO laPlantaDTO) {
        Planta planta = new Planta();
        planta.setNombrecientifico(laPlantaDTO.getNombrecientifico());
        planta.setAlturamaxima(laPlantaDTO.getAlturamaxima());
        planta.setCategoria(laPlantaDTO.getCategoria());
        planta.setEpocaplantado(laPlantaDTO.getEpocaplantado());
        planta.setNombrevulgar(laPlantaDTO.getNombrevulgar());
        return planta;
    }
}
