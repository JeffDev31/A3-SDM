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
@Table(name = "tb_relatorio")
public class Relatorio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String dataSolicitacao;
    private String reclamacao;
    private byte foto1;
    private byte foto2;
    private byte foto3;
    private byte foto4;
    private String laudo;
    private Double valorReembolso;

    
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;
    
    public Relatorio() {
    }

public Relatorio(Long id, String dataSolicitacao, String reclamacao, byte foto1, byte foto2, byte foto3,
        byte foto4, String laudo, Double valorReembolso) {
    this.id = id;
    this.dataSolicitacao = dataSolicitacao;
    this.reclamacao = reclamacao;
    this.foto1 = foto1;
    this.foto2 = foto2;
    this.foto3 = foto3;
    this.foto4 = foto4;
    this.laudo = laudo;
    this.valorReembolso = valorReembolso; }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(String reclamacao) {
        this.reclamacao = reclamacao;
    }

    public byte getFoto1() {
        return foto1;
    }

    public void setFoto1(byte foto1) {
        this.foto1 = foto1;
    }

    public byte getFoto2() {
        return foto2;
    }

    public void setFoto2(byte foto2) {
        this.foto2 = foto2;
    }

    public byte getFoto3() {
        return foto3;
    }

    public void setFoto3(byte foto3) {
        this.foto3 = foto3;
    }

    public byte getFoto4() {
        return foto4;
    }

    public void setFoto4(byte foto4) {
        this.foto4 = foto4;
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public Double getValorReembolso() {
        return valorReembolso;
    }

    public void setValorReembolso(Double valorReembolso) {
        this.valorReembolso = valorReembolso;
    }

    @Override
    public String toString() {
        return "Relatorio [id=" + id + ", dataSolicitacao=" + dataSolicitacao + ", reclamacao=" + reclamacao
                + ", foto1="
                + foto1 + ", foto2=" + foto2 + ", foto3=" + foto3 + ", foto4=" + foto4 + ", laudo=" + laudo
                + ", valorReembolso=" + valorReembolso + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((dataSolicitacao == null) ? 0 : dataSolicitacao.hashCode());
        result = prime * result + ((reclamacao == null) ? 0 : reclamacao.hashCode());
        result = prime * result + foto1;
        result = prime * result + foto2;
        result = prime * result + foto3;
        result = prime * result + foto4;
        result = prime * result + ((laudo == null) ? 0 : laudo.hashCode());
        result = prime * result + ((valorReembolso == null) ? 0 : valorReembolso.hashCode());
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
        Relatorio other = (Relatorio) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (dataSolicitacao == null) {
            if (other.dataSolicitacao != null)
                return false;
        } else if (!dataSolicitacao.equals(other.dataSolicitacao))
            return false;
        if (reclamacao == null) {
            if (other.reclamacao != null)
                return false;
        } else if (!reclamacao.equals(other.reclamacao))
            return false;
        if (foto1 != other.foto1)
            return false;
        if (foto2 != other.foto2)
            return false;
        if (foto3 != other.foto3)
            return false;
        if (foto4 != other.foto4)
            return false;
        if (laudo == null) {
            if (other.laudo != null)
                return false;
        } else if (!laudo.equals(other.laudo))
            return false;
        if (valorReembolso == null) {
            if (other.valorReembolso != null)
                return false;
        } else if (!valorReembolso.equals(other.valorReembolso))
            return false;
        return true;
    }

}