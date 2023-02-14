import javax.swing.*;

public class Function {
	
	public boolean check(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x>=0 || x<0);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
public void DollarToRub(double Minput) {
	double Rub = Minput * 73.86;
	JOptionPane.showMessageDialog(null, "Amount of Rub: " +Rub+" Rubles");
}

public void DollarToJPY(double Minput) {
	double JPY = Minput * 133;
	JOptionPane.showMessageDialog(null, "Amount of JPY: "+JPY+" Yen");
}
}
