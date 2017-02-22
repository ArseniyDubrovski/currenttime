package com.github.arseniydubrovski.dev4;

import java.util.Map;


public class MapAdder {
  private FrequenceOfDigraph output = new FrequenceOfDigraph();

  public Map<String, Double> adder(String addedInput) {
    return output.calculator(addedInput);
  }
}
