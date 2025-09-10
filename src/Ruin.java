import java.util.Scanner;
public class Ruin {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("what's your starting amount?");
        double startAmount = in.nextDouble(); 
        System.out.println("what's your winning chance?");
        double winChance = in.nextDouble();
        System.out.println("wha's your winning limit?");
        double winLimit = in.nextDouble();

        while (startAmount>0 && startAmount<winLimit){
        double random = Math.random();
        if (random<winChance) {
        startAmount++;}
        else {
        startAmount--;} 
        }
        if(startAmount==0) {
            System.out.println("Sucker");}
        else {
            System.out.println("Congratulations, You Are Rich.");}
    }
}