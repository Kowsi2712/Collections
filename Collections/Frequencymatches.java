package com.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Frequencymatches {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[] = new String[n];
		ArrayList<String> l = new ArrayList<String>();
		for(int i=0; i< n; i++)
		{
		    a[i] = sc.nextLine();
		    l.add(a[i]);
		}
		String b=sc.nextLine();
		l.add(b);
		for (int i=0; i < n; i++)
		{ 
			if(b.equals(a[i]))
		       flag++;
			
			else
			  continue;
        } 
		System.out.println(flag);
	}
}
