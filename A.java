package phoneBook;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook adb = new AddressBook();
		
		
		while(true) {
			String s = "enter 1 for Add\n enter 2 for search\n enter 3 for delete\n enter 4 for exit.";
			String input = JOptionPane.showInputDialog(null, s);
			char in = input .charAt(0);
			
			switch(in) {
			case '1':
				adb.addNew();
				break;
				
			case '2':
				String n1 = JOptionPane.showInputDialog(null,"put Name for search");
				adb.search(n1);
				break;
				
			case '3':
				String n2 = JOptionPane.showInputDialog(null,"put Name for delete record");
				adb.search(n2);
				break;
				
			case '4' :
				System.exit(in);
			}
		}

	}

}

class person{
	String name;
	String address;
	String phoneNum;
	
	//constructor
	
	public person(String n, String a, String p) {
		this.name = n;
		this.address = a;
		this.phoneNum = p;
	}
	
	// print info (function)
	public void print() {
	JOptionPane.showMessageDialog(null,"name:"+this.name+"\naddress:"+this.address+"\nphone:"+this.phoneNum);
	}
	
}
