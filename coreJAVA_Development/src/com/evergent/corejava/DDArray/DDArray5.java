package com.evergent.corejava.DDArray;

public class DDArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[5][5];
		int count=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				count+=1;
				arr[i][j]=count;
				System.out.print(arr[i][j]);
			}
			System.out.println();
	}

	}

}
