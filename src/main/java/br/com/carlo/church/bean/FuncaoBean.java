/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlo.church.bean;

import br.com.carlo.church.dao.DAO;
import br.com.carlo.church.modelo.Cargo;
import br.com.carlo.church.modelo.Funcao;
import br.com.carlo.church.modelo.Membro;
import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author carlo
 */
@ManagedBean
public class FuncaoBean {
	
	private Funcao funcao = new Funcao();
        private DataModel dmFuncao;
        
        public FuncaoBean(){
           carregaDataModel();
        }
        
        private void carregaDataModel(){
            dmFuncao = new ListDataModel(  new DAO<Funcao>(Funcao.class).listaTodos());
        }
	
	
	public void gravar() {
        System.out.println("Gravando livro " + this.funcao.getDsFuncao());
        
    
        new DAO<Funcao>(Funcao.class).adiciona(this.funcao);
        carregaDataModel();
        funcao = new Funcao();
    }
        
        
        /////

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public DataModel getDmFuncao() {
        return dmFuncao;
    }

    public void setDmFuncao(DataModel dmFuncao) {
        this.dmFuncao = dmFuncao;
    }
    

   
        
        

}
