import javax.swing.*;

public class Runner {

	public static void main(String[] args) {
		Function f = new Function();
		Object[] option1 = {"RUB", "YEN", "Quit"};
		Object[] option2 = {"Try Again", "Quit"};
		
		
		while(true) {
			String input = JOptionPane.showInputDialog( null, "Enter value: ");
			System.out.println(input);
			if(f.check(input) == true) {
				Double Minput = Double.parseDouble(input);
				
				int choice1 = JOptionPane.showOptionDialog(null, "Choose Which Currency You Wish To Convert", 
						"Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
						option1, option1[2]);
				
				if(choice1 == 0) {
					f.DollarToRub(Minput);
					
				int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Conventer",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
							
				if(choice2==0) {		
				}else {break;}
							
				}else if(choice1 == 1) {
					f.DollarToJPY(Minput);
				}else {break;}
				
	            }else {
				JOptionPane.showMessageDialog(null, "Invalid Output");
				
				
				
			}
		}
		
		
	}
}
