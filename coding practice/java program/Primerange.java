// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.*;
class Primerange {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int start=sc.nextInt();
   int end=sc.nextInt();
  StringBuilder sb=new StringBuilder();
  for(int i=start;i<=end;i++){
      boolean isPrime=true;
      if(i<=1){
          isPrime=false;
      }
      for(int j=2;j<=Math.sqrt(i);j++){
          if(i%j==0){
              isPrime=false;
              break;
          }
      }
      if(isPrime){
          sb.append(i).append(" ");
      }
  }
 System.out.print(sb);
    }
}