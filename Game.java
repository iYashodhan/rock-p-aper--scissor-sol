import java.util.Arrays;
import java.util.List;
import java.util.Random;


class Game {
    public static void main(String[] args) {
        
        List<String> hands = Arrays.asList("rock", "paper", "scissor");
        List<String> paperHand = Arrays.asList("rock", "paper");
        List<String> scissorHand = Arrays.asList("paper", "scissor");

        Random rand = new Random();
        
        String player1 = hands.get(rand.nextInt(hands.size())); // generates a random index to get a random hand
        String player2 = hands.get(rand.nextInt(hands.size()));

        System.out.println("player one hand: " + player1);
        System.out.println("player two hand: " + player2);
        
        if(player1 == player2){
            System.out.print("\ndraw, its a draw");
        }
        else if (paperHand.contains(player1) && paperHand.contains(player2)){
            System.out.print("\npaper, ");

            if (player1 == "paper") {
                System.out.print("\n player1 wins, ");
                
            }
            else {
                System.out.print("\n player2 wins, ");
                
            }
        }
        else if (scissorHand.contains(player1) && scissorHand.contains(player2)){
            System.out.print("\nscissor");

            if (player1 == "scissor") {
                System.out.print("\n player1 wins, ");
                
            }
            else {
                System.out.print("\n player2 wins, ");
                
            }
        }
        else{
            System.out.println("\nrock");

            if (player1 == "rock") {
                System.out.print("\n player1 wins, ");
                
            }
            else {
                System.out.print("\n player2 wins, ");
                
            }

        }
        
    }
}