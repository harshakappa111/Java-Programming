import java.util.*;

class Guesser {
	int g;
	public int guessMethod() {
		System.out.println("MR Guesser  please guess the number");
		Scanner sc= new Scanner(System.in);
		g=sc.nextInt();
		 if(g <10) {
			  
		   }
		   else {
			   System.out.println("Mr Guesser please the guess the number below 10");
		   System.out.println("and restart the game");
	  	 System.exit(0);
		   }   
		return g;
	}
	
}
class Player{
	int p;
static	int count=0;
     public int playerMethod() {
    	
    	 Scanner sc= new Scanner(System.in);
    	System.out.println("Guess the number from player"+ ++count);
    
    	 int p= sc.nextInt();
    	 
    	 return p;
     }
     
	 
}
class Umpire  {
	 int g1fromg;
	int p1fromp;
	int p2fromp;
	int p3fromp;
	
	public void umpireMethod() {
	     Guesser gu= new Guesser(); 
		   
	      g1fromg=   gu.guessMethod();
	     Player pl= new Player();
	     p1fromp= pl.playerMethod();
	     Player pl1= new Player();
	      p2fromp= pl1.playerMethod();
	    		Player pl2= new Player();
	                 p3fromp  =  pl2.playerMethod();
	}
	public void  compare() {
	     if(p1fromp==g1fromg ) {
	    	 if(p2fromp==g1fromg && p3fromp==g1fromg  ) {
	    		 System.out.println("winner is player1 and player2 and player3");
	    		
	    	 }
	    	 else if (p3fromp==g1fromg) {
	    		 System.out.println("winner is player1 and player2");
	    	 }
	    	 else if(p2fromp==g1fromg) {
	    	
	    		 System.out.println("winner is player1 and player2" );
	    	 }
	    	 else
	    	 System.out.println("winner is player 1");
	   
	     }
	     else if(p2fromp==g1fromg) {
	    	  if (p3fromp==g1fromg) {
	    		 System.out.println("winner is player2 and player3");
	    	  }
	    	  else
	    	 System.out.println("winner is player 2");
	     }
	     else if (p3fromp==g1fromg) {
	    	 System.out.println("winner is player 3");
	     }
	     else
	    	 System.out.println("All players are lost in the game please try again");
	}
	

}
public class MiniProject {

	public static void main(String[] args) {
		Umpire ump= new Umpire();
		ump.umpireMethod();
      ump.compare();
	
	}

}
