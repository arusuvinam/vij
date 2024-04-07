package org.com;

public class Array {
	public static void main(String[] args) {
	

	int a[]= new int[5];
	a[0]=1;
	a[1]=2;
	a[3]=9;
	System.out.println(a[0]);


	String b[]= {"manu,anu,vij,sush"};
	
	System.out.println(b[0]);
		
		String c[]= {"manu","anu"};
		System.out.println(b[0]);
for (int i = 0; i < c.length; i++) {
	System.out.println(c[i]);
	
}
for (String d : c) {
	System.out.println(d);
	
}
 int l = b.length;
 System.out.println(l);
 
	}

}
