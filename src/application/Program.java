package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import exceptions.AccountError;

public class Program {

	public static void main(String[] args) {
		 
		   Scanner sc = new Scanner (System.in);
		    sc.useLocale(Locale.US);
		  try {
			  System.out.println("Enter account data");
			    System.out.print("Number: ");
			    int number = sc.nextInt();
			    sc.nextLine();
			    System.out.print("Holder: ");
			    String holder = sc.nextLine();
			    System.out.print("Initial balance: ");
			    double balance = sc.nextDouble();
			    System.out.print("withdraw limit: ");
			    double withdrawLimit = sc.nextDouble();
			    
			    Conta conta = new Conta (number, holder, balance, withdrawLimit);
			    
			    System.out.print("Enter amount for withdraw: ");
			    double withdraw = sc.nextDouble();
			    
			    conta.withdraw(withdraw);
			    
			    System.out.println(conta);
		  }
		  catch (AccountError e) {
			 System.out.println("Error: "+ e.getMessage());
		  }
		   
		    
		    sc.close();
		    

	}

}
