import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class CIS2323_Week01_Homework2 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Business Card of Bibek Gupta");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setPreferredSize(new Dimension(600, 300));

		
		JTextArea textArea = new JTextArea(
		"============================================================================" +
		"	Bibek Gupta				                                       " +
		"Student, Oklahoma State University - Oklahoma City                                " +
		"                                                                            " +
		"6413 N Warren Ave			p: (405)430-6994                                 " +
		"Oklahoma City, OK			e: bibek.gupta@okstate.edu                  " +
		"				g: github.com/bbekjava                            " +
		"============================================================================");
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);

		
		frame.add(textArea);
		frame.pack();
		frame.setVisible(true);
	}
}