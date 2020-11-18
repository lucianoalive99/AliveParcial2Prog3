package ar.edu.undec.plantas.persistencia.entity;

import ar.edu.undec.plantas.core.dominio.Planta;

import javax.persistence.*;

@Entity(name="planta")
@SequenceGenerator(name="planta_id_seq", initialValue = 1, sequenceName = "planta_id_seq",allocationSize = 1)

public class PlantaEntity {

    @Id
    @Column(name= "idplanta")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "planta_id_seq")

    private Integer id;
    @Column(name = "nombrecientifico")
    private String nombrecientifico;
    @Column(name = "nombrevulgar")
    private String nombrevulgar;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "epocaplantado")
    private String epocaplantado;
    @Column(name = " alturamaxima")
    private Integer alturamaxima;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public static Planta plantaEntityToPlanta(PlantaEntity laPlantaEntity){
        Planta plantaCore = new Planta();

        plantaCore.setNombrecientifico(laPlantaEntity.getNombrecientifico());
        plantaCore.setNombrevulgar(laPlantaEntity.getNombrevulgar());
        plantaCore.setEpocaplantado(laPlantaEntity.getEpocaplantado());
        plantaCore.setAlturamaxima(laPlantaEntity.getAlturamaxima());
        plantaCore.setCategoria(laPlantaEntity.getCategoria());
        return plantaCore;
    }

    public static PlantaEntity plantaToPlantaEntity(Planta laPlanta){
        PlantaEntity plantaEntity = new PlantaEntity();

        plantaEntity.setNombrecientifico(laPlanta.getNombrecientifico());
        plantaEntity.setNombrevulgar(laPlanta.getNombrevulgar());
        plantaEntity.setEpocaplantado(laPlanta.getEpocaplantado());
        plantaEntity.setAlturamaxima(laPlanta.getAlturamaxima());
        plantaEntity.setCategoria(laPlanta.getCategoria());
        return plantaEntity;
    }
}
