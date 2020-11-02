package RockPaperScissors;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissorsController {
	private RockPaperScissorsView theView;
	private RockPaperScissorsModel theModel;
	
	public RockPaperScissorsController(RockPaperScissorsView theView, RockPaperScissorsModel theModel) {
		
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addSubmitListener(new submitListener());
		
	}
	
	class submitListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String player1, player2 = "";
			
			
				player1 = theView.getFirstPlayer();
				player2 = theView.getSecondPlayer();
				
				theModel.whoWon(player1, player2);
				theView.setResult(theModel.getResult());
				
				
			
			
			
				
		}
		
	}

}
