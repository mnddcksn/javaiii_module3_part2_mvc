package RockPaperScissors;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RockPaperScissorsView extends JFrame{
	
	private JLabel inst = new JLabel ("Enter 'o' for rock, '-' for paper, or 'x' for scissors         ");
	private JLabel p1Label = new JLabel("Player 1");
	private JTextField p1 = new JTextField (5);
	private JLabel p2Label = new JLabel("Player 2");
	private JTextField p2 = new JTextField (5);
	private JButton submitButton = new JButton ("Submit");
	private JLabel winner = new JLabel("Winner");
	private JTextField win = new JTextField (12);
	
	RockPaperScissorsView(){
		
		JPanel rpsPanel = new JPanel();
		this.setTitle("Rock, Paper,Scissors");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(370, 200);
		
		rpsPanel.add(inst);
		rpsPanel.add(p1Label);
		rpsPanel.add(p1);
		rpsPanel.add(p2Label);
		rpsPanel.add(p2);
		rpsPanel.add(submitButton);
		rpsPanel.add(winner);
		rpsPanel.add(win);
		
		this.add(rpsPanel);
		
	}
	
	public String getFirstPlayer() {
		return p1.getText();
	}
	
	public String getSecondPlayer () {
		return p2.getText();
	}
	
	public String getResult() {
		return win.getText();
	}
	
	public void setResult (String result) {
		win.setText(result);
	}
	
	void addSubmitListener (ActionListener listenForSubmitButton) {
		submitButton.addActionListener(listenForSubmitButton);
	}

	
}
