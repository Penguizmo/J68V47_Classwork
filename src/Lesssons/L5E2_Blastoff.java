package Lesssons;

public class L5E2_Blastoff {
    public static void main(String[] args) {
            //No need for scanner as there is no user input required
            //Reverse the code from slide 13 as sum is going negative
        for (int count = 10; count >= 1; count--) {
            //add %n to starte a new line
            System.out.format("%d %n", count);
        }
//use } to end the for loop and have Blastoff at the end of the loop
        System.out.print("Blastoff ");
    }
}
