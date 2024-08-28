package com.evergent.corejava.manasa.Application4;

import java.io.IOException;
import java.util.Scanner;
public class CoffeeOrderingSystem  extends Coffeeordering {

	public static void main(String[] args)  throws IOException {
		Scanner scanner = new Scanner(System.in);
		Coffeeordering c1=new Coffeeordering();
		PaymentModule p=new PaymentModule();
		c1.address();
		
	        ReportModule report = new ReportModule();
	        while (true) {
	            
	            System.out.println("======================");
	            System.out.println(" Coffee Main Menu");
	            System.out.println("======================");
	            System.out.println("1 - Ordering Module");
	            System.out.println("2 - Payment Module");
	            System.out.println("3 - Report Module");
	            System.out.println("4 - Exit Module");
	            System.out.println("======================");
	            System.out.println("Enter your choice (1, 2, 3, 4): ");

	         
				int moduleChoice = scanner.nextInt();

	            switch (moduleChoice) {
	                case 1:
	                    System.out.println("Ordering Module");
	                 
	                    System.out.println("======================");
	                    System.out.println("1 - to order coffee");
	                    System.out.println("2 - to select additional add-ons");
	                    System.out.println("3 - Return to Main Menu");
	                    System.out.println("======================");
	                    System.out.println("Enter your choice (1, 2, 3): ");

	                    int submoduleChoice = scanner.nextInt();

	                    switch (submoduleChoice) {
	                        case 1:
	                            c1.SelectCoffeeType();
	                            c1.SelectType();
	                            c1.SelectQuantity();
	                            c1.CalculateTotalamount();
	                            break;

	                        case 2:
	                            c1.additionalons();
	                            break;
	                    }
	                    break;

	                case 2:
	                    System.out.println("Payment Module");
	                    System.out.println("======================");
	                    System.out.println("1 - to display total amount to be paid");
	                    System.out.println("2 - to make payment");
	                    System.out.println("3 - Return to Main Menu");
	                    System.out.println("======================");
	                    System.out.println("Enter your choice (1, 2, 3): ");

	                    int paymentChoice = scanner.nextInt();

				
					switch (paymentChoice) {
	                        case 1:
	                            p.displayTotalAmount(c1);
	                            break;

	                        case 2:
	                            p.makePayment(c1);
	                            break;
	                    }
	                    break;

	                case 3:
	                    System.out.println("Report Module");
	                    System.out.println("======================");
	                    System.out.println("1 - to display invoice for order");
	                    System.out.println("2 - to display the summary of orders and payments made");
	                    System.out.println("3 - Return to Main Menu");
	                    System.out.println("======================");
	                    System.out.println("Enter your choice(1,2,3):");
	                    int reportchoice=scanner.nextInt();
		switch(reportchoice) {
		case 1:
			report.displayInvoice(c1);
			break;
		case 2:
			report.displaySummary(c1);
		}
	            }
	        }
	}
}