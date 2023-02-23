package com.practice;
import java.util.Scanner;
import java.util.ArrayList;

	public class Xobin1 {
		
		void setData(ArrayList<Integer> a) {
			
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < 5; i++) 
			{
				a.add(sc.nextInt());
			}
		}

		void checkPrime(ArrayList<Integer> a) {
			int sum = 0;
			for (Integer x : a) {
				int mid = x / 2;
				int i = 2;
				while (i <= mid) 
				{
					if (x % i == 0) {
						break;
					}
					i++;
				}
				if (i >= mid) {
					sum = sum + x;
				}

			}
			System.out.println(sum);
		}

		public static void main(String args[]) {
			ArrayList<Integer> list = new ArrayList<>();
			Xobin1 m = new Xobin1();
			m.setData(list);
			m.checkPrime(list);
		}
}
