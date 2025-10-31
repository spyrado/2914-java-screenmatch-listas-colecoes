package br.com.alura.screenmatch.principal;

import java.util.HashMap;
import java.util.Map;

public class PrincipalHashMap {

  public static void main(String[] args) {

    Map<String, Integer> usandoHashMap = new HashMap<>();

    usandoHashMap.put("Cachorro", 1);
    usandoHashMap.put("Gato", 2);
    usandoHashMap.put("Cavalo", 3);


    System.out.println(usandoHashMap.get("Cachorro"));

  }
}
