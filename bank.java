package bank;
import java.util.Scanner;
    
public class bank {
    	     	
		public static double dividend(double balance2, double balance3) {
   			double div = balance3-balance2; 			  
   			return div;
   		}
    	   
        public static void main(String[] args) {
          
        	Scanner input = new Scanner (System.in);
        	Scanner passInput = new Scanner (System.in);
            System.out.println("---------------------------");
            System.out.println("Java Federal Credit Union");
            System.out.println("---------------------------");     
            
            double initialBalance = 574.72;
            double rate = 0.0005;
            double time = 12.0;
            double power = (time*(1/time));
            
            
            double balance1 = initialBalance - 100;
          //  System.out.println(balance1);
            
            double balance2 = balance1 - 20;
          //  System.out.println( balance2);
         
            double balance3 = balance2*(Math.pow(1+(rate/time), power));
            
          // System.out.println(balance3);
            
            double balance4 = balance3 + 25.53;
          //System.out.println(balance4);
            String strBalance4 = String.format("%.2f",balance4);
            
            double div = balance3-balance2;
            String strDiv = String.format("%.2f",div);
                     
            int user = 0;
            String correctPass = "Nerds are cool";
         
            while (user!=123) {
            System.out.println("Enter Account Number:");
            user= input.nextInt();
            
            if (user!= 123) {

                System.out.print("\n*************************************\n");
                System.out.printf("* Invalid Account Number, Try Again! *\n");
                System.out.print("*************************************\n");
            }  
        }
        
        System.out.println("Enter Password:");
        for (int i =0; i < 3; i++) {
        	String password = passInput.nextLine();
        	if (password.equals(correctPass)) {
        		break;
        	}
        	if (i < 2) {
                System.out.print("\n*****************************\n");
                System.out.printf("* Wrong Password, Try Again *\n");
                System.out.print("*****************************\n");
        	}
 
        	if (i ==2) {
        		
                System.out.print("\n*************************************************\n");
                System.out.printf("* Too many failed attempts, you are now locked! *\n");
                System.out.print("*************************************************");
        		System.exit(0);
        	}
        }    
        	System.out.println("\nWelcome to Java Federal Credit Union, Sunita!\n");
    
            System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.printf("\n Account Balance: $%.2f \n",balance4);
            System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");              
            
            String[][] transaction = new String[5][4];  
            
            
            transaction[0][0] = "5/02/19";
            transaction[0][1] = "Deposit of $25.53 ";
            transaction[0][2] = "AIN8DKN23K";
            transaction[0][3] =String.format("%.2f", balance4);
         

            transaction[1][0] = "4/30/19";
            transaction[1][1] = "Divdend of " + String.format("%.2f", div);
            transaction[1][2] = "N/A";
            transaction[1][3] = "$454.74";
           
            
            transaction[2][0] = "4/29/19";
            transaction[2][1] = "ATM Withdrawl of $20.00";
            transaction[2][2] = "9NAK3ORRJ1";
            transaction[2][3] = "$454.72";
            
            
            transaction[3][0] = "4/16/19";
            transaction[3][1] = "Transfer of $100 to Alice";
            transaction[3][2] = "87N27JDNMQ";
            transaction[3][3] = "$474.72";
          
            
            transaction[4][0] = "4/15/19";
            transaction[4][1] = "Pay Check of 400 from XYZ Corporation";
            transaction[4][2] = "43KNCIQATC";
            transaction[4][3] = "$574.72";
            
           
            int space = 0;
            
            
    		for (int row = 0; row < transaction.length; ++row) {
              space = Math.max(transaction[row].length, space);
            }

            // Find the maximum length of a string in each column
            int[] lengths = new int[space];
            for (int row = 0; row < transaction.length; ++row) {
              for (int column = 0; column < transaction[row].length; column++) {
                lengths[column] = Math.max(transaction[row][column].length(), lengths[column]);
              }
              
            }            
            String[] formats = new String[lengths.length];
            for (int row = 0; row < lengths.length; ++row) {
             formats[row] = "|"+ "%1$-" + lengths[row] + "s" + "|"
                 + (row + 1 == lengths.length ? "\n" : "        ");
           }
            System.out.println("_______________________________________________________________________________________________");
            System.out.println("  DATE\t\t\t\tDESCRIPTION\t\t\tTRANSACTION # \t     BALANCE");
            System.out.println("----------------------------------------------------------------------------------------------");
            for (int row = 0; row < transaction.length; row++) {
              for (int column = 0; column < transaction[row].length; column++) {
                System.out.printf(formats[column], transaction[row][column]);
                if (row == 3 && column == 3) {
                	System.out.println("\t\t  M. Jackson");
                }
                if (row == 4 && column == 3) {
                	System.out.println("\t\t  XYZ Corporation");
                }
              }
  
            }
            System.out.print("________________________________________________________________________________________________");
            } 
        {    
    }
}  

      
        
        
    
     

