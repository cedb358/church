/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlo.church.bean;

import br.com.carlo.church.dao.DAO;
import br.com.carlo.church.modelo.Cargo;
import br.com.carlo.church.modelo.Membro;
import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author carlo
 */
@ManagedBean
public class CargoBean {
	
	private Cargo cargo = new Cargo();
        private DataModel dmCargo;
        
        public CargoBean(){
           carregaDataModel();
        }
        
        private void carregaDataModel(){
            dmCargo = new ListDataModel(  new DAO<Cargo>(Cargo.class).listaTodos());
        }
	
	
	public void gravar() {
        System.out.println("Gravando livro " + this.cargo.getDsCargo());
        
    
        new DAO<Cargo>(Cargo.class).adiciona(this.cargo);
        carregaDataModel();
        cargo = new Cargo();
    }
        
        
        /////

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public DataModel getDmCargo() {
        return dmCargo;
    }

    public void setDmCargo(DataModel dmCargo) {
        this.dmCargo = dmCargo;
    }
    

   
        
        

}
