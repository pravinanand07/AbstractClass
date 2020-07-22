package org.abs;

public class Month2 extends Month5   {
	public void wed() {
		System.out.println("wednesday");
	}
public void thur() {
	System.out.println("thursday");
}
public void tue1() { 
	System.out.println("tuesday1");
}
public void wed1() {
	System.out.println("wednesday1");
}
public static void main(String[] args) {
	Month2 m = new Month2();
	m.thur();
	m.wed();
	m.tue1();
	m.wed1();
}
}
