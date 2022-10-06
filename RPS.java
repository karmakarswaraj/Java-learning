import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main (String [] args){
//COMPUTER PLAYER
        String [] rps = {"r","p","s"};
        String Compmove = rps[new Random().nextInt(rps.length)];

//HUMAN PLAYER
        Scanner move = new Scanner(System.in);
        String usermove;

        while (true){
            System.out.println("Please enter your move: \n(r=rock, p=paper & s=scissors)");
            usermove = move.next();

            if(usermove.equals("r") || usermove.equals("p") || usermove.equals("s")) {
                break;
            }
            System.out.println(usermove + " IS AN INVALID MOVE.");
        }
        System.out.println("You played: "+usermove);
        System.out.println("Computer played: " + Compmove);
//GAME PLAY
        if (usermove.equals(Compmove)){
            System.out.println("GAME TIED!!");
        }
        else if (usermove.equals("r"))
        {
            if (Compmove.equals("s")) {
                System.out.println("You WIN");
            } else if (Compmove.equals("p")) {
                System.out.println("You LOOSE");
            }
        }

        else if (usermove.equals("s"))
        {
            if (Compmove.equals("r"))
            {
                System.out.println("You LOOSE");
            } else if (Compmove.equals("p"))
            {
                System.out.println("You WIN");
            }
        }
        else {
            if (Compmove.equals("r"))
            {
                System.out.println("You WIN");
            }
            else if (Compmove.equals("s"))
            {
                System.out.println("You LOOSE");
            }
        }
    }
}
