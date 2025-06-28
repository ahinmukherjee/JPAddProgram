// factorial calculate using JOptionpane

// package JOptionPane;

import javax.swing.JOptionPane;

class Factorial{
	void fact(int n){
		int result=1;
		if(n<0){
			JOptionPane.showMessageDialog(null,"Negative nuber not possible in factorial");
			return;
		}
		else if(n==0){	
			JOptionPane.showMessageDialog(null,"Factorial of 0 is: 1");
		}
		else{
			for(int i=1; i<=n; i++){
				result=result*i;
			}
			JOptionPane.showMessageDialog(null,"Factorial is:"+result);
		}
	}
}

public class FactorialUsingSwingPackage{
	public static void main(String[] args){
	int n;
	String input=JOptionPane.showInputDialog(null,"Enter a number");
	if(input.equals("")){
		JOptionPane.showMessageDialog(null,"Field can not be empty");
	}
	else{
		try{
			n=Integer.parseInt(input);
			Factorial f= new Factorial();
			f.fact(n);
        }
		catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null,"Plz give valid input:"+nfe);
	}	}
    }
}