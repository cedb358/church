package br.com.carlo.church.modelo;

import br.com.carlo.church.modelo.Autor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-08-10T21:08:35")
@StaticMetamodel(Livro.class)
public class Livro_ { 

    public static volatile SingularAttribute<Livro, Double> preco;
    public static volatile SingularAttribute<Livro, String> isbn;
    public static volatile SingularAttribute<Livro, String> titulo;
    public static volatile SingularAttribute<Livro, Integer> id;
    public static volatile ListAttribute<Livro, Autor> autores;
    public static volatile SingularAttribute<Livro, String> dataLancamento;

}