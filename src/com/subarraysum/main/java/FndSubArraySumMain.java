package com.subarraysum.main.java;

import java.util.Scanner;

import com.subarraysum.dto.java.OutputDto;
import com.subarraysum.impl.java.FindMaxSubArrayImpl;
import com.subarraysum.impl.java.IFindMaxSubArraySum;

public class FndSubArraySumMain {
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter how many elements: ");
			int size = Integer.parseInt(scan.nextLine());
			Integer arr[] = new Integer[size];
			System.out.print("Please enter the elements: ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(scan.nextLine());
			}
			IFindMaxSubArraySum fmss = new FindMaxSubArrayImpl();
			System.out.print("Finding max sub array sum : ");
			OutputDto dto = fmss.findMaxSubArraySum(arr);

			System.out.println("Max sum is " + dto.getMaxSum());
			System.out.println("Starting index " + dto.getStartingIndex());
			System.out.println("Ending index " + dto.getEndingIndex());
			System.out.println("length " + dto.getLength());
			System.out.println("Elements are : ");
			for (int k=0; k <= dto.getElements().length; k++) {
				System.out.println(arr[k] + " ");
			}
			
		} catch (Exception ex) {
			System.err.println("Exception found : " + ex.getMessage());
		}
	}
}
