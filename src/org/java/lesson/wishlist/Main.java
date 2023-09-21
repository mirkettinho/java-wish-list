package org.java.lesson.wishlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		List<WishListSingle> wishList = new ArrayList<>();
		
		String gift = "";
		
		do {
			
			System.out.print("Enter gift: ");
			gift = sc.nextLine();
			
			if (gift.equals("")) break;
			
			wishList.add(new WishListSingle(gift));
			
			System.out.println("\nWishlist length: " + wishList.size() + "\n");
			
		}while (!gift.equals(""));
		
		sc.close();
		
		System.out.println("\nWishlist:");
		
		for (WishListSingle single : wishList) {
			System.out.println(single);
		}
	}
}
