package com.exam;

import java.util.Scanner;

public class FenJie {
	
	//�ҳ���С������
	public static int findYS(int i) {
		int j;
		for(j=2;j<=i;j++) {
			if(i%j==0) {
				break;
			}
		}
		return j;
	}
	
	public static void main(String[] args) {
		System.out.println("������һ��������");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int k=findYS(num);
		//�ж��Ƿ��������Ǳ�������������ҳ���С������
		if(k==num) {
			System.out.println(num+"="+"1*"+k);
		}else {
			System.out.print(num+"="+k);
			while(k!=num){
				num=num/k;
				k=findYS(num);
				System.out.print("*"+k);
			}
		 
	}
	}

}
