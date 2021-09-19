public class Dice {
    public static void main(String[] args) {
    	
    	
    	  int die1 = (int) Math.floor(Math.random()*(6-1)+1);//=6 =1..6
    	  //random the first Dice
          int die2 = (int) Math.floor(Math.random()*(6-1)+1); //1..6
          //random the second Dice
          int die3 = (int) Math.floor(Math.random()*(6-1)+1);//1..6
          //random the third Dice		
          int roll = die1 + die2 + die3;   //Total score of 3 dices
          
          int die4= (int) Math.random()*(6-1)+1;
       
          System.out.println("Score of the first dice is " + die1); //print score of first dice
          System.out.println("Score of the second dice is " + die2); // print score of second dice
          System.out.println("Score of the third dice is " + die3); 
          System.out.println("Score of the forth dice is " + die4); // print score of third dice
          System.out.println("Your total score is " + roll); // print total score of 3 dice
          
          if (roll % 7 == 0) { // if the total score divide by 7 and remainder = 0 youwin
        	  System.out.println("You win");
          }
          else { //else you lost
        	  System.out.println("You lost");
          }
    }  
}  