package com.pk.core.Operators;

public class StingConcat {
public static void main(String[] args) {
	String s1="Nine Tail",s2=" Fox";
	System.out.println(s1+s2);
	
	int a=15,b=10,c=50;
	System.out.println(a+b+c);
	System.out.println(a+b+s1+c+b);
	System.out.println(s1+a+b+s2+c+a); //the behaviour of + will be math untill string is encountered
	
	
	
}
}
