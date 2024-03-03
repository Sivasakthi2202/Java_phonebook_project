package phoneBook;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AddressBook {
		ArrayList<person> personList;
		
		//constructor
		public AddressBook() {
			personList = new ArrayList<>();
		}
		
		public void addNew() {
			String nm = JOptionPane.showInputDialog("put Name");
			String ad = JOptionPane.showInputDialog("put Address");
			String ph = JOptionPane.showInputDialog("put Phone Number");
			
			person p = new person(nm,ad,ph);
			
			personList.add(p);
		}
		
		public void search(String n) {
			for(int i=0; i<personList.size();i++) {
				person p = (person)personList.get(i);   //Down Casting
				if(p.name.equals(n)) {
					p.print();
				}
			}
		}
		public void delete(String n) {
			for(int i=0; i<personList.size();i++) {
				person p = (person)personList.get(i);   //Down Casting
				if(p.name.equals(n)) {
					personList.remove(i);
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
