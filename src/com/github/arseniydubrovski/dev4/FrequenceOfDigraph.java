package com.github.arseniydubrovski.dev4;

import java.util.HashMap;
import java.util.Map;


public class FrequenceOfDigraph {

  private Map<String, Integer> digraph = new HashMap<>();
  private int numberOfvalues = 0;

  public Map<String, Double> calculator(String input) {
    char[] alphabeticalCharacters = input.toCharArray();
    Character firstPartOfDigraph = null;
    Integer valueOfDigraph = 1;


    for (char alphabeticalCharacter : alphabeticalCharacters) {
      if (Character.isWhitespace(alphabeticalCharacter)) {
        firstPartOfDigraph = null;
      } else {
        if (!Character.isLetter(alphabeticalCharacter)) {
          continue;
        }
        if (firstPartOfDigraph != null) {
          String nameOfDigraph = "" + firstPartOfDigraph + alphabeticalCharacter;
          if (digraph.containsKey(nameOfDigraph)) {
            digraph.put(nameOfDigraph, (digraph.get(nameOfDigraph) + valueOfDigraph));
          } else {
            digraph.put(nameOfDigraph, valueOfDigraph);
          }
          numberOfvalues++;
        }
        firstPartOfDigraph = alphabeticalCharacter;
      }
    }

    Map<String, Double> result = new HashMap<>();
    for (Map.Entry<String, Integer> entry : digraph.entrySet()) {
      result.put(entry.getKey(), entry.getValue() * 1.0 / numberOfvalues);
    }
    return result;
  }
}
