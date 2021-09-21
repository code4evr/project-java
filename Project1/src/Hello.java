import javax.swing.JOptionPane;

public class Hello {

	public static void main(String[] args) {
		int rows = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows"));
		int columns = Integer.parseInt(JOptionPane.showInputDialog("Enter number of columns"));
		pattern(rows, columns);
	}
	static void display(int output) {
		System.out.print(output);
	}
	
	static void pattern(int x, int y) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<=i; j++) {
				display(i);
			}
			System.out.println();
		}
	}
	

}
