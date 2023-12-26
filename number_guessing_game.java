import java.util.Random;
import java.util.Scanner;
public class number_guessing_game {

    public static void main(String[] args) {
        int upperbound = 501;  //To generate a random value from 0 - 500
        int rounds=3;
        int tries=10;
        int rscore=0;
        int tscore=0;
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME.");
        System.out.println("GUESS THE RANDOM NUMBER FROM 0-500. YOU GET 10 TRIES.");
        System.out.println("THERE ARE 3 ROUNDS.");
        for(int j=1; j<=rounds; j++){       //round loop

            System.out.println("Round: "+j);
            Random rand = new Random();
            int int_random = rand.nextInt(upperbound);
//            System.out.println("random no. is  for this round is shhhh... "+int_random);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your guess: ");
            int guess=sc.nextInt();

            for(int i=2; i<=(tries+1); i++){
                int off=int_random-guess ;

                if(off==0){
                    if(i==2){           //Guessed it first try
                        System.out.println("Wohooo! You've guessed it.");
                        rscore=100;
                        System.out.println("this round's score= "+rscore);
                        tscore=tscore+rscore;
                        break;
                    }
                    if(i==11){
                        System.out.println("Wohooo! You've guessed it.");
                        rscore=10;
                        System.out.println("this round's score= "+rscore);
                        tscore=tscore+rscore;
                        break;

                    }
                    else{
                        System.out.println("Wohooo! You've guessed it.");
                        rscore=(100-(i-2)*10);
                        tscore=tscore+rscore;
                        System.out.println("this round's score= "+rscore);
                        break;
                    }
                }
                else{
                    if(i==11){    //NO right guess
                        System.out.println("You have lost this round.");
                        break;
                    }

                    if(off>0){
                        System.out.println("Guess UP.");
                    }
                    else{
                        System.out.println("Guess DOWN.");
                    }
                    System.out.println("----------------------------");
                    System.out.println("Try Number "+i);
                    System.out.print("Try again. ");
                    System.out.println("Enter your guess: ");
                    guess=sc.nextInt();
                }
            }
            System.out.println("The number was: "+int_random);
            System.out.println("*****************************************");
        }
        System.out.println("THE END.");
        System.out.println("Your total score is "+tscore+"/300.");
        if(tscore>200){
            System.out.println("AMAZING!");
        }
        else if(tscore>100){
            System.out.println("WELL PLAYED!");
        }
        else{
            System.out.println("GOOD EFFORT!");
        }
    }
}