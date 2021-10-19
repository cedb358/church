package br.com.carlo.church.modelo;

import br.com.carlo.church.modelo.Filme;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-08-10T21:08:35")
@StaticMetamodel(Filme.class)
public class Filme_ { 

    public static volatile SingularAttribute<Filme, Double> preco;
    public static volatile SingularAttribute<Filme, String> isbn;
    public static volatile SingularAttribute<Filme, String> titulo;
    public static volatile ListAttribute<Filme, Filme> filmes;
    public static volatile SingularAttribute<Filme, Integer> id;
    public static volatile SingularAttribute<Filme, String> dataLancamento;

}