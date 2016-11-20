package view;
import java.util.Scanner;
import javax.swing.JOptionPane;
import model.LinkedLsInt;
public class ViewExample {
	public static void main(String[] args) {
	    Scanner inpute = new Scanner(System.in);
		int number= 0;
		int option = 0;
		LinkedLsInt linked = new LinkedLsInt();
	  do {
		 try {
				option  = Integer.parseInt(JOptionPane.showInputDialog(null,
						"-1. add Firts element \n"
						+ "-2 add Final element \n"
						+ "-3	View all\n"
						+ "-9. exit \n","input option"));
				switch (option) {
				case 1:
					number  = Integer.parseInt(JOptionPane.showInputDialog(null,
							"-1. digit element \n","input number"));
					linked.addInitial(number);
					break;
				case 2:
					number  = Integer.parseInt(JOptionPane.showInputDialog(null,
							"-1. digit element \n","input number"));
					linked.addlast(number);
					break;
				case 3:
					linked.viewListed();
					break;
				default: 
					break;
				}
			 
		 		} catch (Exception e) {		
		 			
		 			}
		  
		  
	} while (option !=9);
	}

}
