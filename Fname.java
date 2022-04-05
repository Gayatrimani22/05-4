package org;

import java.util.Scanner;

public class Fname {

	public static void main(String[] args) {
		
				String fname;
				String lname;
			
				Scanner sc=new Scanner(System.in);
				System.out.println("enter fname");
				 fname=sc.next();
				System.out.println("enter lname");
			    lname=sc.next();
				String str=fname+lname;
				System.out.println("hello"+str);
			
	}

}
