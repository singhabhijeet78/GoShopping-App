package com.tns.application;

import java.util.*;

import com.tns.framework.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static int order() {
//		GSNormalAcc user = new GSNormalAcc(0, "default", 0, false);
		NormalAcc user = new GSNormalAcc(0, "default", 0, false);

		String[] items = { "Mobile", "Laptop", "Watch", "Shirt", "T-shirt" };
		int charges[] = { 10000, 50000, 2000, 800, 400 };

		System.out.println("Enter product number(1-5):");
//		Product Number
		int productNo = sc.nextInt();
		switch (productNo) {
		case 1: {
			System.out.println(items[0] + " Rs." + charges[0]);
			user.bookProduct(productNo);
			break;
		}
		case 2: {
			System.out.println(items[1] + " Rs." + charges[1]);
			user.bookProduct(productNo);
			break;
		}
		case 3: {
			System.out.println(items[2] + " Rs." + charges[2]);
			user.bookProduct(productNo);
			break;
		}
		case 4: {
			System.out.println(items[3] + " Rs." + charges[3]);
			user.bookProduct(productNo);
			break;
		}
		case 5: {
			System.out.println(items[4] + " Rs." + charges[4]);
			user.bookProduct(productNo);
			break;
		}
		}

		return charges[productNo - 1];
	}

	/* Entry Point */
	public static void main(String[] args) {
//		Object Creation
//		ShopFactory user = new GSShopFactory();
		PrimeAcc puser = new GSPrimeAcc(111, "default", 0, true);
		NormalAcc nuser = new GSNormalAcc(222, "default", 0, false);

//		User Choice
		int choice;
//		flags
		boolean f1 = true;

//		Total Price
		float total;

//		User name
		String uname;

		System.out.println("WELCOME TO GO SHOPPING\n");
		System.out.println("Do you have an account?*(Please Enter 1/2/3)");
		System.out.println("1. Yes\n2. No\n3. Exit");
		choice = sc.nextInt();
		while (f1)// byDefault true
			switch (choice) {
			case 1:// Already have Account
				f1 = false;
				System.out.println("Enter your name");
				uname = sc.next();
				System.out.println("Account Type\n1. Prime \n2. Normal\n");
				choice = sc.nextInt();

				switch (choice) {
				case 1:// Prime Account
					puser = new GSPrimeAcc(1, uname, 500, true);
					System.out.println(puser.toString());
					
					total = order() + puser.getDeliverycharges();
					System.out.println("Total amount to pay Rs." + total);
					break;

				case 2:// Normal Account
					nuser = new GSNormalAcc(2, uname, 0, false);
					System.out.println(nuser.toString());
					
					total = order() + nuser.getDeliveryCharges();
					System.out.println("Total amount to pay Rs." + total);
					break;

				default:// Invalid input
					System.out.println("Invalid input...");
					break;
				}
				break;

			case 2:// Create New Account
				f1 = false;
				System.out.println("Do you want Prime account?*(Please Enter 1/2)");
				System.out.println("1. Yes\n2. No");
				choice = sc.nextInt();
				System.out.println("Enter your Name");
				uname = sc.next();
				switch (choice) {
				case 1:// Prime Account
					System.out.println("***Pay Rs.500 for Prime Subscription***");
					System.out.println("Enter Amount:");
					int subAmt = sc.nextInt();

					while (subAmt != 500) {

						if (subAmt < 500) {
							System.out.println("***Please pay Remaining***\nEnter Amount:");
							subAmt = subAmt + sc.nextInt();
						} else if (subAmt > 500) {
							System.out.println("Here is your change: Rs. " + (subAmt - 500));
							subAmt = 500;
						}
					}
					System.out.println("**************************************");
					System.out.println("*****Your Prime Account Activated*****");
					System.out.println("**************************************");

//					Same code use 
					puser = new GSPrimeAcc(1, uname, subAmt, true);
					System.out.println(puser.toString());
				
					total = order() + puser.getDeliverycharges();
					System.out.println("Total amount to pay Rs." + total);
					break;

				case 2:// Normal Account
//					Same code use 
					nuser = new GSNormalAcc(2, uname, 0, false);
					System.out.println(nuser.toString());
					
					total = order() + nuser.getDeliveryCharges();
					System.out.println("Total amount to pay Rs." + total);
					break;

				default:// Invalid input
					System.out.println("Invalid input...");
					break;
				}

				break;

			case 3:// Exit
				f1 = false;
				System.out.println("Thank You, Come Again!");
				break;

			default:// Invalid input
				System.out.println("Invalid input...");
//				f1 = true;
				System.out.println("Do you have an account?*(Please Enter 1/2)");
				System.out.println("1. Yes\n2. No");
				choice = sc.nextInt();
				break;
			}
	}

}