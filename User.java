package com.technoelevate.Cart;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int z=1;
	if(z==1)
	{
		System.out.printf("******** welcome to valuable custmer *****************%nenter your choice %n  1. Add grocery items %n  2. View cart items %n  3. modify items in grocery %n  4. remove items from cart %n  5. check whether item present or not %n  6. Quit from menu");
	int n= sc.nextInt();
	if(n==6)
	{
	}
	else
	{
	if(n==1){
		System.out.printf("Select your choice %n  1.Rice %n  2.Oil %n  3.Salt %n  4.Soap %n  5.Brush %n ");
int n2= sc.nextInt();
for(int i=0;i<n2;i++)
{
	myCart.add(i-1);
}
	}
	else if(n==2) {
		for(int p=0; p<myCart.size(); p++)
		{
		System.out.println(myCart.get(p));	
		}
	}
	else if(n==3) {
		System.out.println("select item what to replace");
		for(int p=0; p<myCart.size(); p++)
		{
		System.out.println(myCart.get(p));	
		}
		int n4= sc.nextInt();
		System.out.printf("Select your choice %n  1.Rice %n  2.Oil %n  3.Salt %n  4.Soap %n  5.Brush %n ");
		int n5= sc.nextInt();
        myCart.set(n4-1, n5-1);
	}
	else if(n==4) {
		System.out.println("select item delete");
		int n3= sc.nextInt();
        myCart.remove(n3-1);
	}
	else if(n==5) {
		System.out.println("items available :"+cart);
    }
	}
	}
	}
	private static ArrayList cart = new ArrayList();
	static ArrayList myCart = new ArrayList();
	public static void List()
	{
		cart.add("Rice");
		cart.add("Oil");
		cart.add("Salt");
		cart.add("Soap");
		cart.add("Brush");
		
	}
}
