/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlo.church.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author carlo
 */
@Entity
public class Empresa {

    @Id
    @GeneratedValue
    private Integer id;
    private String dsEmpresa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDsEmpresa() {
        return dsEmpresa;
    }

    public void setDsEmpresa(String dsEmpresa) {
        this.dsEmpresa = dsEmpresa;
    }

}
