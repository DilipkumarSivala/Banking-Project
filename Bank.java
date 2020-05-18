package bankingUsingSwitch;

import java.util.Scanner;

public class Bank {
	    public static void main(String[] args)
	    {
	        BankInternal myObj = new BankInternal();
	        Scanner sc=new Scanner(System.in);
	        int input=0;
	        String continueToTrans="Yes";
	        int count=1;
	        if(count!=1){
	          System.out.println("Again You need to Transection :: ");
	          continueToTrans=sc.next();
	          count++;
	        }
	       do{
	    	    if(count!=1 && continueToTrans.equalsIgnoreCase("Yes")){
	   	           System.out.println("Again You need to Transection ::");
	   	           continueToTrans=sc.next();
	   	           if(continueToTrans.equalsIgnoreCase("No"))
		   	           {
		   	        	   System.out.println("Thanks for Choosing or HDFC bank !!!!!");
		   	           }
	   	        }
	    	   if(continueToTrans.equalsIgnoreCase("Yes"))
	    	   {
	    		     System.out.println();
			        System.out.println("Menus");
			        System.out.println("1. Open Account");
			        System.out.println("2. WithDraw Amount");
			        System.out.println("3. Deposit Amout");
			        System.out.println("4. Balance Enqury");
			        System.out.println("5. Exit");
			        System.out.println("---------------------------");
			        System.out.println("Plaese choose your options");
			        input=sc.nextInt();
			             switch (input) {
						        case 1: 
									     myObj.openAccount();
									     break;
								case 2:
									 myObj.withDraw();
										break;
								case 3:
										myObj.deposit();
										break;
								case 4:
									    myObj.balnceEnquries();
										break;
									
								case 5:
									     System.exit(0);
									     break;
							  default :
								       System.out.println("---------------------------");
								       System.out.println("You selected Wrong choice...!!");
						        	   System.out.println("Please enter Correct choice::");
						        	   System.out.println("---------------------------");
						        	   break;
				       }
			        }
			   count++;
	       }while(input!=8);  
	    }
}
