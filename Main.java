 //import java.util.Random;
 import java.util.ArrayList;
public class Main{

    public static void main(String[] args) {

        /*Random rand = new Random();
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
        }/*/
        
        String[][] people = { { "Alessandro", "Giunta", "alegiunt99@kkklk.com", "19/08/1999" } };

        System.out.println(people);

        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(5);
        myNumbers.add(6);
        myNumbers.add(4);
        myNumbers.add(4);
        myNumbers.add(3450);

        myNumbers.size();

        System.out.println(myNumbers);
        System.out.println("l'array è lungo: " + myNumbers.size());

        for (int position = 0; position < myNumbers.size(); position++) {

            int number = myNumbers.get(position);

            System.out.println("At the position " + position + " there is " + number);

        }
    }
}

