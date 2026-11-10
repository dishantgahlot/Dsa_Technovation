class Solution {
    public String longestCommonPrefix(String[] strs){ 


         int i = strs.length;

         int[] arr = new int[i];

         for(int l = 0 ; l<i ; l++){
            arr[l] = strs[l].length();
         }

         int smallest = arr[0];

         for(int x  : arr){

            if(x<smallest){
                smallest = x;
            }
         }

        

         String prefix = "";

        for(int j = 0 ; j<smallest ; j++){

            char ch = strs[0].charAt(j);

            for(int  k =1 ; k<i ; k++){

                if(strs[k].charAt(j)!=ch){

                    return prefix;

                    

                }

            }

            prefix +=ch;



         }

          return prefix;

        
      

        

     }
        
 }
