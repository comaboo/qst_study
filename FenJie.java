package com.exam;

import java.util.Scanner;

public class FenJie {
        //分支修改测试
	//找出最小质因数
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
		System.out.println("请输入一个整数：");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int k=findYS(num);
		//判断是否质因数是本身，不是则迭代找出最小质因数
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
