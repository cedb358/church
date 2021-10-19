/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlo.church.bean;

import br.com.carlo.church.dao.DAO;
import br.com.carlo.church.modelo.Livro;
import br.com.carlo.church.modelo.Membro;
import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author carlo
 */
@ManagedBean
public class MembroBean {
	
	private Membro membro = new Membro();
        private DataModel dmMembro;
        
        public MembroBean(){
           carregaDataModel();
        }
        
        private void carregaDataModel(){
            dmMembro = new ListDataModel(  new DAO<Membro>(Membro.class).listaTodos());
        }
	
	
	public void gravar() {
        System.out.println("Gravando livro " + this.membro.getNome());
        
    
        new DAO<Membro>(Membro.class).adiciona(this.membro);
        carregaDataModel();
    }

    public DataModel getDmMembro() {
        return dmMembro;
    }

    public void setDmMembro(DataModel dmMembro) {
        this.dmMembro = dmMembro;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

   
        
        

}
