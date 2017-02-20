package com.largestnumber.demo;

public class Way2 { //array

 
public static void main(String[] args) {
int a[] = new int[] { 5, 23, 45, 75, 10, 50, 7 };
int s = a[0];
int l = a[0];
for (int i = 0; i < a.length; i++) {
if (a[i] > l)
l = a[i];
else if (a[i] < s)
s = a[i];
}
System.out.println("the smallest number in the array is:" + s);
System.out.println("the largest number in the array is:" + l);
}
}