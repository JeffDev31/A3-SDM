package br.uam.sdm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marca;
    private String modelo;
    private String medida;
    private String identificacaoDot;
    private String identificacaoSerie;
    private Double profundidadeSulco;

    @ManyToOne
    @JoinColumn(name="id_cliente")
  
    private Cliente cliente;

   public Produto() {}

    public Produto(Long id, String marca, String modelo, String medida, String identificacaoDot,
            String identificacaoSerie, Double profundidadeSulco) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.medida = medida;
        this.identificacaoDot = identificacaoDot;
        this.identificacaoSerie = identificacaoSerie;
        this.profundidadeSulco = profundidadeSulco;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getIdentificacaoDot() {
        return identificacaoDot;
    }

    public void setIdentificacaoDot(String identificacaoDot) {
        this.identificacaoDot = identificacaoDot;
    }

    public String getIdentificacaoSerie() {
        return identificacaoSerie;
    }

    public void setIdentificacaoSerie(String identificacaoSerie) {
        this.identificacaoSerie = identificacaoSerie;
    }

    public Double getProfundidadeSulco() {
        return profundidadeSulco;
    }

    public void setProfundidadeSulco(Double profundidadeSulco) {
        this.profundidadeSulco = profundidadeSulco;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", medida=" + medida
                + ", identificacaoDot=" + identificacaoDot + ", identificacaoSerie=" + identificacaoSerie
                + ", profundidadeSulco=" + profundidadeSulco + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((medida == null) ? 0 : medida.hashCode());
        result = prime * result + ((identificacaoDot == null) ? 0 : identificacaoDot.hashCode());
        result = prime * result + ((identificacaoSerie == null) ? 0 : identificacaoSerie.hashCode());
        result = prime * result + ((profundidadeSulco == null) ? 0 : profundidadeSulco.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (medida == null) {
            if (other.medida != null)
                return false;
        } else if (!medida.equals(other.medida))
            return false;
        if (identificacaoDot == null) {
            if (other.identificacaoDot != null)
                return false;
        } else if (!identificacaoDot.equals(other.identificacaoDot))
            return false;
        if (identificacaoSerie == null) {
            if (other.identificacaoSerie != null)
                return false;
        } else if (!identificacaoSerie.equals(other.identificacaoSerie))
            return false;
        if (profundidadeSulco == null) {
            if (other.profundidadeSulco != null)
                return false;
        } else if (!profundidadeSulco.equals(other.profundidadeSulco))
            return false;
        return true;
    }


}