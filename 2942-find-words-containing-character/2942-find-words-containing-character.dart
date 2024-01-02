class Solution {
  List<int> findWordsContaining(List<String> words, String x) {
      List<int> indexes = [];
      for(int i=0;i< words.length;i++) {
          if(words[i].contains(x)){
            indexes.add(i);
          }
      }
    return indexes;
  }
}