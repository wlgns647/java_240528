package day01;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
         int[] arr = new int[99];
       
          for (int i = 0; i < array.length; i++) {
            arr[array[i]]++;
           }
          
        int count =0 ;
        int max = 0;
            
          for (int i = 0; i < array.length; i++) {
               if(arr[i]>count){
                   count = arr[i];
                   max = i;
               }
           }
                  
              

        
   
       answer = max;
        
        return answer;
    }
}