package bankingUsingSwitch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class BankInternal {
	    Long acno;   // attribues of Bank
	    float mainBal=0;  // attribues of Bank
	    Scanner sc = new Scanner(System.in);
	    BankInternal() // constrctor
	    {
	        System.out.println("Enter Account Number:");
	        acno = sc.nextLong();
	        System.out.println("Enter Initial Balance:");
	        mainBal = sc.nextFloat();        
	    }
	    void openAccount()
	    {
	    	 System.out.println("Please Fill Mandaotary fileds");
	    	 System.out.println("Enter Enter your name:");
	    	 String name=sc.next();
	    	 System.out.println("Enter Enter your phone number:");
	    	 long phoneNo=sc.nextLong();
	    	 
	    	 System.out.println("Enter Your  Date of Birth in this formate  dd-MM-yyyy");

	    	 String date = sc.next();

	    	 SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	    	 Date date2=null;
	    	 try {
	    	     //Parsing the String
	    	     date2 = dateFormat.parse(date);
	    	     Calendar cal = Calendar.getInstance();
	    	     cal.setTime(date2);
	    	     String formatedDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" +         cal.get(Calendar.YEAR);
	    	     System.out.println("Your Date of Birth :: " + formatedDate);  
	    	 } catch (ParseException e) {
	    	     // TODO Auto-generated catch block
	    	     e.printStackTrace();
	    	 }
	    	// System.out.println(date2);
	    	if((name != null && !name.isEmpty()) && phoneNo != 0L && (date2 !=null || date2.equals(""))){ 
		    	 System.out.println("Your account number created sucessfully  !!!!!");
		    	 System.out.println("-------------------------------------------------------");
		    	 System.out.print("Your Account Number is   :: ");
		    	 Random rand = new Random();
		    	    String card = "HDFC";
		    	    for (int i = 0; i < 12; i++)
		    	    {
		    	        int n = rand.nextInt(10);
		    	        card= card+Integer.toString(n);
		    	    }
		    	    for (int i = 0; i < 16; i++)
		    	    {
		    	        if(i % 4 == 0)
		    	        {
		    	          System.out.print(" ");
		    	        }
		    	          System.out.print(card.charAt(i));
		    	    }
		    	   System.out.println();
		    	   System.out.println("-------------------------------------------------------");
	       }else
	       {
	    	   System.out.println("Invalied data you entered .. plese try again");
	       }
	    }
	    void deposit() //behaiours of bank
	    {
	    	float depositAmount; // local variable
	    	System.out.println("Enter Deposit Amount::");
	    	depositAmount=sc.nextFloat();
	    	mainBal=mainBal+depositAmount;
	    	System.out.println("Deposited! Account Balance is "+mainBal);
	    }
	    void withDraw(){
	    	float withDrawAmout;
	    	System.out.println("Enter withDraw Amount ::");
	    	withDrawAmout=sc.nextFloat();
	    	if(withDrawAmout<mainBal){
	    	  mainBal=mainBal-withDrawAmout;
	    	  System.out.println("WithDraw! Account Balance is "+mainBal);
	    	}else
	    	{
	    		System.out.println("Inssuficiant Found !!!");
	    	}
	    	
	    }
	    void balnceEnquries(){
	    	System.out.println("Your main balnce is ::"+mainBal);
	    }
	}
