package com.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Sumavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		float avg=0;
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		Integer a[] = new Integer[n];
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=0; i<n; i++)
		{
		    a[i] = sc.nextInt();
		    l.add(a[i]);   
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+l.get(i);
		}
		avg=sum/n;
		System.out.println(sum);
		System.out.print(avg);
	}

}
