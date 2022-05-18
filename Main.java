import java.util.Random;

public class Main{

    public static void main(String[] args) {

        Random rand = new Random();
        int max = 6;
        

        int user = rand.nextInt(max);
        int computer = rand.nextInt(max);

        if (user > computer) {
            System.out.println("User: " + user);
            System.out.println("Computer: " + computer);
            System.out.println("HAI VINTO! :D");
        } else if(computer > user) {
            System.out.println("User: " + user);
            System.out.println("Computer: " + computer);
            System.out.println("HAI PERSO! :(");
        } else {
            System.out.println("User: " + user);
            System.out.println("Computer: " + computer);
            System.out.println("PAREGGIO! :/");
        }
        
    }
}