class Solution {
  int numberOfBeams(List<String> bank) {

      List<int> lights = [];
    for(int i = 0;i<bank.length;i++){
        int ct = '1'.allMatches(bank[i]).length;
        if(ct>0){
        lights.add(ct);
        }
    }
      int rays = 0;
      for(int i = 0;i<lights.length-1;i++){
        rays += lights[i] * lights[i+1];
    }
      
      return rays;
  }
}