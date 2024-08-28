package com.evergent.corejava.manasa.Application4;
import java.util.Scanner;    
public class Coffeeordering  extends  CoffeeDetails implements CoffeeInterface{
	int Coffeecost;
	  int typeCost;
	  int additionalCost;
	  int disAmount;
	 int  totalamount;
	  int numCoffees;
	 String quantity;
	static {
		  System.out.println("\n\t\t\t\t Welcome To COFFEE ORDERING SYSTEM");
	}
	public Coffeeordering() {
		Coffeecost=0;
		typeCost=0;
		additionalCost=0;
		disAmount=0;
		totalamount=0;
		numCoffees=0;
		quantity="";
	}
		
		public  void displayMenu() {
			  System.out.println("Coffee Type \t Description \t Charge per Coffee");
	          System.out.println("===============================================");
	          System.out.println("1 \t\t Espresso \t\t Rs10.00");
	          System.out.println("2 \t\t  Latte \t\t  Rs15.00");
	          System.out.println("3 \t\t Cappuccino \t\t Rs20.00");
	          System.out.println("4 \t\t Americano \t\t Rs30.00 ");
	          System.out.println("===============================================");
	         
		}
		public  final void SelectCoffeeType() {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			displayMenu();
			  System.out.println("Enter the type of coffee you want(1,2,3,4):");
			 int  coffeetype=sc.nextInt();
			  switch(coffeetype) {
			  case 1:
				  Coffeecost=10;
				  break;
			  case 2:
				  Coffeecost=15;
				  break;
			  case 3:
				  Coffeecost=20;
				  break;
			  case 4: 
				  Coffeecost=30;
				  break;
				  default:
					  System.out.println("invalid choice");
					  break;
			  }
			
			  System.out.println("coffe cost is:"+Coffeecost);
		    
			
		}
		

		@Override
		public void SelectType() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the type of coffee(cold,hot):");
			  System.out.println("======================");
		        System.out.println("1. Cold");
		        System.out.println("2. Hot");
		        System.out.println("===================");
			int type=sc.nextInt();
			switch(type) {
			case 1:
				typeCost=5;
				break;
			case 2:
				typeCost=5;
			}
			 System.out.println("type cost is:"+typeCost);
		}

		@Override
		public void SelectQuantity() {
			Scanner sc=new Scanner(System.in);
			 System.out.println("enter how much quantity you want(short,medium,large):");
			 quantity =sc.next();
			 System.out.println("your entered quantity is:"+quantity);
			      
			 
		}

		@Override
		public void CalculateTotalamount() {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter no.of coffees:");
		 numCoffees=sc.nextInt();
		 totalamount=(numCoffees*Coffeecost)+typeCost;
		 System.out.println("total amount before discount is:"+(totalamount+additionalCost));

	     if (numCoffees >= 1 && numCoffees <= 3)
	         disAmount = totalamount;
	     else if (numCoffees >= 4 && numCoffees <= 6)
	         disAmount = (int) (totalamount - (totalamount * 0.05));
	     else if (numCoffees >= 7 && numCoffees <= 10)
	         disAmount = (int) (totalamount - (totalamount * 0.10));
	     else if (numCoffees >= 11)
	         disAmount = (int) (totalamount - (totalamount * 0.15));

	     System.out.println("Amount for ordered coffee after discount is Rs " + disAmount);
		
		}
	public void additionalons() {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Additional Add-ons \t Description \t Charge per Add-on");
	     System.out.println("========================================================================");
	     System.out.println("1 \t\t Extra Shot \t\t Rs 5.00 per shot");
	     System.out.println("2 \t\t Milk \t\t Rs 3.00 per serving");
	     System.out.println("3 \t\t Sugar \t\t Rs 2.00 per serving");
	     System.out.println("========================================================================");
	     System.out.println("Enter your Add-on choice (1, 2, 3): ");
	     int addOnChoice = scanner.nextInt();
	     switch (addOnChoice) {
	         case 1:
	             additionalCost = 5;
	             break;
	         case 2:
	             additionalCost = 3;
	             break;
	         case 3:
	             additionalCost = 1;
	             break;
	         default:
	             System.out.println("Invalid choice");
	     }
	     System.out.println("Your additional cost is: Rs " + additionalCost);
	 }
}
	class PaymentModule {
	    public void displayTotalAmount(Coffeeordering order) {
	        System.out.println("Total Amount to be Paid: Rs " + (order.totalamount + order.additionalCost));
	    }
	

	    public void makePayment(Coffeeordering order) {
	        System.out.println("To Make Payment: Rs " + (order.disAmount + order.additionalCost));
	    }
	}

	class ReportModule {
	    public void displayInvoice(Coffeeordering order) {
	        System.out.println("Invoice Display");
	        System.out.println("==================");
	        System.out.println("Order ID : " + (Math.ceil(Math.random() * 1000)));
	        System.out.println("You ordered " + order.numCoffees + " coffees.");
	        System.out.println("To Make Payment: Rs " + (order.disAmount + order.additionalCost));
	    }
	

	    public void displaySummary(Coffeeordering order) {
	        System.out.println("Summary Of Orders");
	        System.out.println("======================");
	        System.out.println("Coffee cost: Rs " + order.Coffeecost);
	        System.out.println("Your selected coffee type cost is: " + order.typeCost);
	        System.out.println("Number of coffees: " + order.numCoffees);
	        System.out.println("Quantity: " + order.quantity);
	        System.out.println("Amount before discount is: Rs " + order.totalamount);
	        System.out.println("Amount after discount: Rs " + order.disAmount);
	        System.out.println("Additional Cost: Rs " + order.additionalCost);
	        System.out.println("Total Amount to be Paid: Rs " + (order.totalamount + order.additionalCost));
	        System.out.println("To Make Payment: Rs " + (order.disAmount + order.additionalCost));
	    }
	}
	

	
	
	
	

