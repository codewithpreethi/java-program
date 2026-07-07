public class Prime {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int num=29;
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.print(num+" is prime");
        }else{
             System.out.print(num+" not a prime");
        }
    }
} {
    
}
