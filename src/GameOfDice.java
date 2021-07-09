/*
      Begin
          display to user "Let's Play Roll Dice!"
          total is equal to 0
          score is equal to 0

          loop while answer to "Roll Again?" is yes and while score is <= 100
              get random number and store into dice1
              get random number and store into dice2


              if dice1 is equal to 1 and dice 2 is equal to 1
                  score is equal to 25
                  total is equal to score plus total

              ifelse dice1 is equal to 1 or dice2 is equal to 1
                  score is equal to 0
              else
                  score is dice1 + dice2
                  total is equal to score + total

              display the value of dice1
              display the value of dice2
              display score
          prompt to user if they would like to play again
          get answer
      End



*/



import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class GameOfDice {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        Random randomizer = new Random();
        int totalScore = 0, score = 0;
        String answer = "yes";


        System.out.println("Let's Play Roll Dice!");            //intro for user to our dice game




        while (answer.startsWith("y") && totalScore < 100){             //game loop. game should exit when score >= 100 or user gives input that doesnt start with 'y'
            int dice1 = randomizer.nextInt(6) + 1;        //random integers from 1-25
            int dice2 = randomizer.nextInt(6) + 1;
            if (dice1 == 1 && dice2 == 1){
                score = 25;
                totalScore += score;
            }else if (dice1 == 1 || dice2 == 1) {
                score = 0;
            }else {
                score = dice1 + dice2;
                totalScore += score;
            }
            System.out.printf("Your rolls are %d & %d\n", dice1, dice2); //displaying to user what their rolls were and their score for the round
            System.out.printf("Score: %d\n", totalScore);

            System.out.println("Roll again (yes/no)?");                  //asking user if they want to play again
            answer = kb.nextLine();
            answer = answer.toLowerCase(Locale.ROOT);

            if (totalScore >= 100){                                      //letting user know that game is over because they scored over 100
                System.out.println("You have scored over 100");
            }
        }
        System.out.println("Thank you for playing!");




    }

}
