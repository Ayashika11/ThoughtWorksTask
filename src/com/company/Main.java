package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int NoOfRows,NoOfColumns,treeNumber,totalNoOftrees;
	Scanner sc = new Scanner(System.in);
	NoOfRows = sc.nextInt();
	NoOfColumns = sc.nextInt();
	treeNumber = sc.nextInt();
	totalNoOftrees = NoOfColumns*NoOfRows;
	if(treeNumber<=NoOfColumns || treeNumber%NoOfColumns==1 || treeNumber%NoOfColumns==0)
	{
		System.out.println("It is a mango tree.");
	}
	else if(treeNumber > totalNoOftrees)
	{
		System.out.println("Enter a valid tree number.");
	}
	else
	{
		System.out.println("Not a mango tree.");
	}
    }
}
