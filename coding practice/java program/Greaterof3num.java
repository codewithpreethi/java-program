public class Greaterof3num {
    public static void main(String[] args) {
       
         int num1=12;
        int num2=9;
        int num3=14;
        
        if(num1>num2 && num1>num3){
            System.out.print(num1);
        }else if(num2>num1 && num2>num3){
            System.out.print(num2);
        }
        else {
            System.out.print(num3);
        }
    }
}