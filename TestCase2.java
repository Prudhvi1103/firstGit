package com.technoelevate.Cart;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCase2 {
	static Scanner sc = new Scanner(System.in);
	 static ArrayList cart = new ArrayList();
		static ArrayList myCart = new ArrayList();
		public static void List()
		{
			cart.add("Rice");
			cart.add("Oil");
			cart.add("Salt");
			cart.add("Soap");
			cart.add("Brush");

			  	
		}
	public static void main (String[] args) {
		int pr =1;
		while(pr==1) {
		System.out.printf("******** welcome to valuable custmer *****************%nenter your choice %n  1. Add grocery items %n  2. View cart items %n  3. modify items in grocery %n  4. remove items from cart %n  5. check whether item present or not %n  6. Quit from menu");
		int n= sc.nextInt();
		
		if(n==1) {
			
		System.out.printf("Select your choice %n  1.Rice %n  2.Oil %n  3.Salt %n  4.Soap %n  5.Brush %n ");
		int num=sc.nextInt();
		myCart.add(num-1,cart);
		System.out.println("your item"+myCart.get(num-1)+"added sucussfully");
		}
		
		else if(n==2) {
			for(int i=0;i<myCart.size();i++) {
			System.out.println(myCart.get(i));
			}
		}
		else if(n==3) {
			System.out.println("select item want to replace");
			for(int i=0;i<myCart.size();i++) {
				System.out.println(myCart.get(i));
				}
			int n1 =sc.nextInt();
			System.out.println("select item for replace");
			for(int i=0;i<cart.size();i++) {
				System.out.println(cart.get(i));
				}
			int n2 =sc.nextInt();
			myCart.set(n1-1, n2-1);
		}
		else if(n==4) {
			System.out.println("choose item want to remove");
			for(int i=0;i<myCart.size();i++) {
				System.out.println(myCart.get(i));
				}
			int n1=sc.nextInt();
			myCart.remove(n1-1);
		}
		else if(n==5) {
			
		}
		System.out.println("enter 1 to add more items 0 for exit");
		 pr=sc.nextInt();
	}
	}
}
