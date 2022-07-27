public class Ineuron {

	public static void main(String[] args) {
	 int num=10;
	  for(int i=0;i<num;i++) {
		  for(int j=0;j<num;j++) {
			   if(i==0||i==num-1||j==num/2)
				   System.out.print("*");
		  
		  else 
			  System.out.print(" ");
		  
		  }
		  System.out.print("   ");
		  for(int n=0;n<num;n++) {
			 if(n==0||n==num-1||n==i)
				 System.out.print("*");
			 else
				 System.out.print(" ");
		  }
		  System.out.print("   ");
		   for(int e=0;e<num;e++) {
			   if(e==0||i==0||i==num/2||i==num-1)
				   System.out.print("*");
		   
		   else 
			   System.out.print(" ");
		   }
		   System.out.print("   ");
		   for	(int u=0;u<num;u++ ) {
				if(u==0&&i!=num-1||u==num-1&&i!=num-1|| i==num-1&&u>=2&&u<=7)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		   System.out.print("   ");
		   for(int r=0;r<num;r++) {
			   if(i==0 || i==(num-1)/2 ||r==0 || r==(num-1) &&i<=(num-1)/2|| i==r&&r!=1&&r!=2&&r!=3)
					System.out.print("*");
				else
					System.out.print(" ");
			   
		   }
		   System.out.print("   ");
		       for(int o=0;o<num;o++) {
		    	   if(o==0&&i!=0&&i!=num-1||o==num-1&&i!=0&&i!=num-1||i==0&&o!=0&&o!=num-1||i==num-1&&o!=0&&o!=num-1)
		    		   System.out.print("*");
		    	   else
		    		   System.out.print(" ");
		       }
		       System.out.print("   ");
		       for(int n=0;n<num;n++) {
					 if(n==0||n==num-1||n==i)
						 System.out.print("*");
					 else
						 System.out.print(" ");
				  }
		   
		  System.out.println( );
	  
	  }

	}

}