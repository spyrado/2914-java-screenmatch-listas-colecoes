package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {

  public static void main(String[] args) {
    Serie lost = new Serie("Lost", 2000);
    lost.avalia(6);
    Filme meuFilme = new Filme("O poderoso chefão", 1970);
    meuFilme.avalia(8);
    Filme outroFilme = new Filme("Avatar", 2023);
    outroFilme.avalia(9);
    Filme filmeDoPaulo = new Filme("Dogville", 2003);
    filmeDoPaulo.avalia(10);

    ArrayList<Titulo> lista = new ArrayList<>();
    lista.add(filmeDoPaulo);
    lista.add(meuFilme);
    lista.add(outroFilme);
    lista.add(lost);

    // versao de estudo
//    for (Titulo item: lista) {
//      System.out.println(item.getNome());
//      if(item instanceof Filme filme) {
//        System.out.println(filme.getClassificacao());
//      }
//    }
//
    // versao mais moderna
    lista
        .stream()
        .peek(item -> System.out.println("TITULO: " + item.getNome()))
        .filter(Filme.class::isInstance)
        .map(Filme.class::cast)
        .forEach(filme -> System.out.println("Classificação: " + filme.getClassificacao()));

//    System.out.println(lista);

    // ordenação LISTA DE STRING

    ArrayList<String> nomes = new ArrayList<>();
    nomes.add("Zayon");
    nomes.add("Gol");
    nomes.add("Apetrecho");
    System.out.println("=== LISTA DE STRING SEM ORDENAÇÃO === ");
    System.out.println(nomes);

    System.out.println("=== LISTA DE STRING COM ORDENAÇÃO === ");
    Collections.sort(nomes);
    System.out.println(nomes);

    System.out.println("=== LISTA DE FILMES SEM ORDENAÇÃO === ");
    System.out.println(lista);

    // ordenação LISTA DE FILMES (OBJETOS)
    System.out.println("=== LISTA DE FILMES COM ORDENAÇÃO === ");
//    Collections.sort(lista, (f1,f2) -> f1.getNome().compareTo(f2.getNome()));
    Collections.sort(lista, Comparator.comparing(Titulo::getNome));
    System.out.println(lista);

    System.out.println("=== LISTA DE FILMES ORDENÇÃO INVERSA === ");
    Collections.sort(lista, Comparator.comparing(Titulo::getNome).reversed());
    System.out.println(lista);

  }
}
