package com.epam.LoggerTask4;

import java.util.Scanner;

import com.epam.LoggerTask4.interest.Interest;

public class ClientApplication_Interest {
	public static void main(String[] args){
        double principal,rate,time;
        Scanner input=new Scanner(System.in);
        System.out.println("enter principal:");
        principal=input.nextDouble();
        System.out.println("enter rate:");
        rate=input.nextDouble();
        System.out.println("enter time:");
        time=input.nextDouble();
        Interest i=new Interest();
        System.out.println("simple interest is:"+i.simple_interest(principal,rate,time));
        System.out.println("compound interest is:"+i.compound_interest(principal,rate,time));
        input.close();
    }

}
