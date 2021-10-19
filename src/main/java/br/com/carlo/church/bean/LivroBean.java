package br.com.carlo.church.bean;

import javax.faces.bean.ManagedBean;

import br.com.carlo.church.dao.DAO;
import br.com.carlo.church.modelo.Livro;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
public class LivroBean {
	
	private Livro livro = new Livro();
        private DataModel dmLivro;
        
        public LivroBean(){
           carregaDataModel();
        }
        
        private void carregaDataModel(){
            dmLivro = new ListDataModel(  new DAO<Livro>(Livro.class).listaTodos());
        }
	
	public Livro getLivro() {
		return livro;
	}
   
	public void gravar() {
        System.out.println("Gravando livro " + this.livro.getTitulo());
        
    
        new DAO<Livro>(Livro.class).adiciona(this.livro);
        carregaDataModel();
    }

    public DataModel getDmLivro() {
        return dmLivro;
    }

    public void setDmLivro(DataModel dmLivro) {
        this.dmLivro = dmLivro;
    }
        
        

}
