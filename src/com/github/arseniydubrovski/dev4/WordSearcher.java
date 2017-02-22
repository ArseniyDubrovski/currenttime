package com.github.arseniydubrovski.dev4;


public class WordSearcher {
  String input;
  int lenth;

  public WordSearcher(String input, int lenth) {
    this.input = input;
    this.lenth = lenth;
  }

  public int searcher(String input, int lenth) {
    int numberOfWords = 0;
    String[] words = input.split(" ");
    for (String word : words) {
      if (word.length() >= lenth) {
        numberOfWords++;
      }
    }
    return numberOfWords;
  }
}
