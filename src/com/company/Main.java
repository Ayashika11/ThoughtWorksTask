package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int NoOfRows,NoOfColumns,treeNumber,lastColumnCount,totalNoOftrees;
	Scanner sc = new Scanner(System.in);
	NoOfRows = sc.nextInt();
	NoOfColumns = sc.nextInt();
	treeNumber = sc.nextInt();
	lastColumnCount = (NoOfRows*NoOfColumns)-(NoOfRows-1);
	totalNoOftrees = NoOfColumns*NoOfRows;
	if(treeNumber<=NoOfRows || treeNumber%NoOfRows==1 || ((lastColumnCount <= treeNumber) && (treeNumber <= totalNoOftrees)))
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
