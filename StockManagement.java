package com.bl.stockmanagement;

import java.awt.Choice;
import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {
	
		ArrayList<String> stockName = new ArrayList<String>();
		ArrayList<Integer> noOfShare = new ArrayList<Integer>();
		ArrayList<Integer> sharePrice = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			StockPortfolio ref = new StockPortfolio();
			int choice;
			do {
			System.out.println("1. Enter new stock \n2. Display the stock report \n3. Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				ref.addStock();
				break;
			case 2:
				ref.stockReport();
				break;
//			case 3:
//				ref.debit();
//				break;
			case 3:
				System.out.println("Byeee!!!");
				break;
			default:
				System.out.println("Enter choice from menu");
			}
		} while(choice != 3);
		}
	
public void addStock() {
	System.out.println("Enter the number of stocks: ");
	int stockNo = sc.nextInt();
	
	System.out.println("Enter the name of stocks: ");
	stockName.add(sc.next());
	
	System.out.println("Enter the number of share: ");
	noOfShare.add(sc.nextInt());
	
	System.out.println("Enter the price of share: ");
	sharePrice.add(sc.nextInt());
}
public void stockReport() {
	int sum = 0;
	System.out.println("********************STOCK REPORT****************");
	for (int i = 0; i < stockName.size(); i++) {
		int total = (noOfShare.get(i) * sharePrice.get(i));
		balance = balance - total;
		sum = sum + total;

		System.out.println("Stock Name: " + stockName.get(i) + "\n Value of each share: " +sharePrice.get(i) + "\n Total value fo share: " +total);
		
		System.out.println("Remaining balance: " +balance);
	}
}

 private void debit() {
	 System.out.println("Enter the amount you want to withdraw: ");
	 int withdrawAmount = sc.nextInt();
	 if(withdrawAmount < balance) {
		 balance = balance - withdrawAmount;
	 }else {
		 System.out.println("Entered amount exceeds account balance");
	 	}
 	}
}


