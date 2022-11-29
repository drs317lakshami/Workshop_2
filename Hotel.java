package com.blz.collection;

import java.util.Scanner;

//Create  Hotel-> Create Rooms with details(typeAC/NOnAC, Price, bed, city)
public class Hotel {	
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the type of room AC or Non AC");
				String AcOrNonAc = sc.next();
				System.out.println("Enter the range of hotel in price");
				long price = sc.nextLong();
				System.out.println("Enter the type of bed single bed or double");
				String singleBedOrdouble = sc.next();
				System.out.println("Enter the city name");
				String cityname = sc.next();
				
				System.out.println("Your selected room ");
				
				System.out.println(AcOrNonAc);
				System.out.println(price);
				System.out.println(singleBedOrdouble);
				System.out.println(cityname);
		}

}