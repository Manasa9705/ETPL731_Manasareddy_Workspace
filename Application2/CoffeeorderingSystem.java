package com.evergent.corejava.manasa.Application2;
import java.io.IOException;

import java.util.Scanner;
public class CoffeeorderingSystem
{
	
	    enum Module {O, P, R, E}
	    enum Submodule1 {C, A, M}
	    enum Submodule2 {T, P, M}
	    enum Submodule3 {I, S, M}
	    enum CoffeeType {A, B, C,D}
	    enum Type{Cold,Hot}

	    static int coffeeCost;
	    static int totalAmount;
	    static int numCoffees;
	    static int discountAmount;
	    static int additionalCost;
	    static int typecost;
	    static String quantity;

	    public static void main(String[] args) throws IOException 
	    {
	    	
	        String module = null;
	        

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("\n\t\t\t\t Welcome To COFFEE  ORDERING SYSTEM");

	        while (true)
	        {
	            System.out.println("======================");
	            System.out.println(" Coffee Main Menu");
	            System.out.println("======================");
	            System.out.println("O - Ordering Module");
	            System.out.println("P - Payment Module");
	            System.out.println("R - Report Module");
	            System.out.println("E - Exit Module");
	            System.out.println("======================");
	            System.out.println("Enter your Module code (O, P, R, E) : ");

	            module = scanner.nextLine();
	            System.out.println("You entered module : " + module);

	            switch (Module.valueOf(module))
	            {
	            
	                case O:
	                    System.out.println(" Ordering Module");
	                    System.out.println("======================");
	                    System.out.println("C - to order coffee");
	                    System.out.println("A - to select additional add-ons");
	                    System.out.println("M - Return to Main Menu");
	                    System.out.println("======================");
	                    System.out.println("Enter your Module code (C, A, M) : ");

	                    module = scanner.nextLine();
	                    switch (Submodule1.valueOf(module))
	                    {
	                        case C:
	                            System.out.println("Coffee Type \t Description \t Charge per Coffee");
	                            System.out.println("===============================================");
	                            System.out.println("A \t\t Espresso \t\t Rs10.00");
	                            System.out.println("B \t\t  Latte \t\t  Rs5.00");
	                            System.out.println("C \t\t Cappuccino \t\t Rs20.00");
	                            System.out.println("D \t\t Americano \t\t Rs30.00 ");
	                            System.out.println("===============================================");
	                            System.out.println("Enter your Coffee Type code (A, B, C,D) : ");

	                            module = scanner.nextLine();

	                            switch (CoffeeType.valueOf(module)) 
	                            {
	                                case A:
	                                    coffeeCost = 10;
	                                    break;
	                                case B:
	                                    coffeeCost = 15;
	                                    break;
	                                case C:
	                                    coffeeCost = 20;
	                                    break;
	                                case D:
	                                    coffeeCost = 30;
	                                    break;
	                            }
	                            System.out.println("coffee cost is:"+coffeeCost);
	                            System.out.println("Enter what type of coffee do you like(Cold ,Hot):");

	                            System.out.println("======================");
	                            System.out.println("Cold");
	                            System.out.println("Hot");
	                            System.out.println("===================");
	                            module=scanner.nextLine();
	                            switch(Type.valueOf(module)) 
	                            {
	                            case Cold:
	                            	typecost=5;
	                            	break;
	                            case Hot:
	                            	typecost=6;
	                            	break;
	                            }
	                            
	                            System.out.println(  module+ "coffee cost is:"+typecost);
	                            System.out.println("Enter how much quantity do you want(short,medium,Large):");
	                            quantity=scanner.nextLine();
	                            System.out.println("your entered quantity is: "+quantity);;
	                            System.out.println("Enter the number of coffees:");
	                            numCoffees = Integer.parseInt(scanner.nextLine());
	                            System.out.println("You selected " + numCoffees + " coffees.");
	                            totalAmount = coffeeCost * (numCoffees+typecost);

	                            System.out.println("Amount for ordered coffee before discount is RS" + totalAmount);
	                            if (numCoffees >= 1 && numCoffees <= 3)
	                                discountAmount = (int) (totalAmount - (totalAmount * 0.00));
	                            else if (numCoffees >= 4 && numCoffees <= 6)
	                                discountAmount = (int) (totalAmount - (totalAmount * 0.05));
	                            else if (numCoffees >= 7 && numCoffees <= 10)
	                                discountAmount = (int) (totalAmount - (totalAmount * 0.10));
	                            else if (numCoffees >= 11)
	                                discountAmount = (int) (totalAmount - (totalAmount * 0.15));

	                            System.out.println("Amount for ordered coffee after discount is RS" + discountAmount);
	                            break;

	                        case A:
	                            System.out.println("Additional Add-ons \t Description \t Charge per Add-on");
	                            System.out.println("========================================================================");
	                            System.out.println("1 \t\t  Extra Shot \t\t  RS 5.00 per shot");
	                            System.out.println("2 \t\t  Milk \t\t RS 3.00 per serving");
	                            System.out.println("3 \t\t Sugar \t\t  RS 2.00 per serving");
	                            System.out.println("========================================================================");
	                            System.out.println("Enter your Add-on code (1, 2, 3) : ");

	                            module = scanner.nextLine();

	                            int addOnCode = Integer.parseInt(module);
	                            switch (addOnCode)
	                            {
	                                case 1:
	                                    additionalCost = 5;
	                                    break;
	                                case 2:
	                                    additionalCost = 3;
	                                    break;
	                                case 3:
	                                    additionalCost = 1;
	                                    break;
	                            }

	                            System.out.println("Your Additional Cost : RS" + additionalCost);
	                            break;
	                    }
	                    
	                    break;
	                    

	                case P:
	                    System.out.println(" Payment Module");
	                    System.out.println("======================");
	                    System.out.println("T - to display total amount to be paid");
	                    System.out.println("P - to make payment");
	                    System.out.println("M - Return to Main Menu");
	                    System.out.println("======================");
	                    System.out.println("Enter your Module code (T, P, M) : ");

	                    module = scanner.nextLine();
	                    switch (Submodule2.valueOf(module)) 
	                    {
	                        case T:
	                        	
	                            System.out.println("Total Amount to be Paid : RS" + (totalAmount + additionalCost));
	                            break;
	                        case P:
	                            System.out.println("To Make Payment : RS" + (discountAmount + additionalCost));
	                            break;
	                    }
	                    break;

	                case R:
	                    System.out.println(" Report Module");
	                    System.out.println("======================");
	                    System.out.println("I - to display invoice for order");
	                    System.out.println("S - to display the summary of orders and payments made");
	                    System.out.println("M - Return to Main Menu");
	                    System.out.println("======================");
	                    System.out.println("Enter your Module code (I, S, M) : ");

	                    module = scanner.nextLine();
	                    
	                    switch (Submodule3.valueOf(module))
	                    {
	                        case I:
	                            System.out.println("Invoice Display");
	                            System.out.println("==================");
	                            System.out.println("Order ID : " + (Math.ceil(Math.random())));
	                            System.out.println("You ordered " + numCoffees + " coffees.");
	                            System.out.println("To Make Payment : RS" + (discountAmount + additionalCost));
	                            break;
	                            
	                        case S:
	                            System.out.println("Summary Of Orders");
	                            System.out.println("======================");
	                         
	                            System.out.println("Coffee cost: RS" + coffeeCost);
	                            System.out.println("your entered coffee type cost is:"+typecost);
	                            System.out.println("Number of coffees: " + numCoffees);
	                            System.out.println("quantity:"+quantity);
	                            System.out.println("Amount before discount is:"+totalAmount);
	                            System.out.println("Amount after discount: RS" + discountAmount);
	                            System.out.println("Additional Cost: RS " + additionalCost);
	                            System.out.println("Total Amount to be Paid: RS" + (totalAmount + additionalCost));
	                            System.out.println("To Make Payment: RS" + (discountAmount + additionalCost));
	                            break;
	                    }
	                    
	                    break;

	                case E:
	                    System.out.println("Exit Module");
	                    System.exit(0);
	                    break;
	           
	            }
	        }
	    }
	}

