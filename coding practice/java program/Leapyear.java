public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int year=2020;
        if(year%4==0  && year%100!=0){
            System.out.print("Leap year");
        }else if(year%400==0){
            System.out.print("Leap year");
        }
        else{
            System.out.print("Not a Leap year");
        }
    }
} {
    
}
