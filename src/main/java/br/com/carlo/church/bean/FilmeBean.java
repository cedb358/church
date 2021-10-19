package br.com.carlo.church.bean;

import javax.faces.bean.ManagedBean;

import br.com.carlo.church.dao.DAO;
import br.com.carlo.church.modelo.Filme;
import br.com.carlo.church.modelo.Livro;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
public class FilmeBean {
	
	private Filme filme = new Filme();
        
        private DataModel dmFilme;
        
        public FilmeBean(){
           carregaDataModel();
        }
        
        private void carregaDataModel(){
            dmFilme= new ListDataModel(  new DAO<Filme>(Filme.class).listaTodos());
        }
	
	public Filme getFilme() {
		return filme;
	}
   
	public void gravar() {
        System.out.println("Gravando filme " + this.filme.getTitulo());
        
    
        new DAO<Filme>(Filme.class).adiciona(this.filme);
        carregaDataModel();
    }

    public DataModel getDmFilme() {
        return dmFilme;
    }

    public void setDmFilme(DataModel dmFilme) {
        this.dmFilme = dmFilme;
    }
        
        

}
