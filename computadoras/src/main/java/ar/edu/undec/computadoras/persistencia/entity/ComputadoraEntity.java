package ar.edu.undec.computadoras.persistencia.entity;


import ar.edu.undec.computadoras.core.dominio.Computadora;

import javax.persistence.*;

@Entity(name="computadora")
@SequenceGenerator(name="computadora_id_seq", initialValue = 1, sequenceName = "computadora_id_seq",allocationSize = 1)
public class ComputadoraEntity {

    @Id
    @Column(name= "idcomputadora")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "computadora_id_seq")
    private Integer id;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "procesador")
    private String procesador;
    @Column(name = "almacenamiento")
    private Integer almacenamiento;
    @Column(name = "tipoalmacenamiento")
    private String tipoalmacenamiento;
    @Column(name = "ram")
    private Integer ram;
    @Column(name = "tipomaquina")
    private String tipomaquina;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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


    public static Computadora ComputadoraEntityToComputadora(ComputadoraEntity computadoraEntity) {
        Computadora laComputadora = new Computadora();

        laComputadora.setcodigo(computadoraEntity.getCodigo());
        laComputadora.setAlmacenamiento(computadoraEntity.getAlmacenamiento());
        laComputadora.setProcesador(computadoraEntity.getProcesador());
        laComputadora.setRam(computadoraEntity.getRam());
        laComputadora.setTipoalmacenamiento(computadoraEntity.getTipoalmacenamiento());
        laComputadora.setTipomaquina(computadoraEntity.getTipomaquina());
        return laComputadora;
    }
    public static ComputadoraEntity ComputadoraToComputadoraEntity(Computadora laComputadora) {
        ComputadoraEntity computadoraEntity=new ComputadoraEntity();

        computadoraEntity.setAlmacenamiento(laComputadora.getAlmacenamiento());
        computadoraEntity.setCodigo(laComputadora.getcodigo());
        computadoraEntity.setProcesador(laComputadora.getProcesador());
        computadoraEntity.setRam(laComputadora.getRam());
        computadoraEntity.setTipoalmacenamiento(laComputadora.getTipoalmacenamiento());
        computadoraEntity.setTipomaquina(laComputadora.getTipomaquina());
        return computadoraEntity;
    }
}
