/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlo.church.bean;

import br.com.carlo.church.dao.DAO;
import br.com.carlo.church.modelo.Empresa;
import br.com.carlo.church.modelo.Membro;
import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author carlo
 */
@ManagedBean
public class EmpresaBean {
	
	private Empresa empresa = new Empresa();
        private DataModel dmEmpresa;
        
        public EmpresaBean(){
           carregaDataModel();
        }
        
        private void carregaDataModel(){
            dmEmpresa = new ListDataModel(  new DAO<Empresa>(Empresa.class).listaTodos());
        }
	
	
	public void gravar() {
        System.out.println("Gravando empresa " + this.empresa.getDsEmpresa());
        
    
        new DAO<Empresa>(Empresa.class).adiciona(this.empresa);
        carregaDataModel();
        empresa = new Empresa();
    }
        
        
        /////

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empres) {
        this.empresa = empresa;
    }

    public DataModel getDmEmpresa() {
        return dmEmpresa;
    }

    public void setDmEmpresa(DataModel dmEmpresa) {
        this.dmEmpresa = dmEmpresa;
    }
    

   
        
        

}
