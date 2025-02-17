//Output:

//Hello, World!
//A
//bC
//dEf
//GhIj
//KlMnO
//pQrStU
//vWxYz[|

import java.util.*;

public class PatternAToZInCapsSmalls {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int n =7;
      int calc = 0;
      boolean flag = false;
      //97 - 122 a-z
      //65 - 90 A-Z
      
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){

          if(calc %2 == 0 ){
            System.out.print((char)(calc+65));
          }
          else{
            System.out.print((char)(calc+97));
            
          }
         calc++;
        }
        System.out.println();
      }
  }
}
