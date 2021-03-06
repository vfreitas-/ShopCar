/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopcar.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import javax.persistence.*;
import javax.persistence.Entity;

/**
 *
 * @author Mandy Grimm
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Modelo.listAllModelosByMarca",
        query = "SELECT m FROM Modelo m WHERE m.marca = :marca")})
public class Modelo implements Serializable
{
    private static final Long serialVersionUID = 1L;
    
    public static final String MODELOS_BY_MARCA = "Modelo.listAllModelosByMarca";
    
    @Id
    @GeneratedValue
    private Integer modeloId;
    private String modelo;
    private String versao;
    @OneToMany(mappedBy = "modelo")
    @Inject private Set<Veiculo> veiculo;
    @ManyToOne
    private Marca marca;

    //<editor-fold defaultstate="collapsed" desc="Hash and Equals">
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.modeloId);
        hash = 61 * hash + Objects.hashCode(this.modelo);
        hash = 61 * hash + Objects.hashCode(this.versao);
        hash = 61 * hash + Objects.hashCode(this.veiculo);
        hash = 61 * hash + Objects.hashCode(this.marca);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Modelo other = (Modelo) obj;
        if (!Objects.equals(this.modeloId, other.modeloId)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.versao, other.versao)) {
            return false;
        }
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return true;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Gets and Sets">
  
    public Integer getModeloId() {
        return modeloId;
    }
    
    public void setModeloId(Integer modeloId) {
        this.modeloId = modeloId;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getVersao() {
        return versao;
    }
    
    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Set<Veiculo> getVeiculo() {
        return veiculo;
    }
    
    public void setVeiculo(Set<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }

    public Marca getMarca() {
        return marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
//</editor-fold>
}
