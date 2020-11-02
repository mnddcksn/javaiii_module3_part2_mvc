package RockPaperScissors;

public class RockPaperScissorsModel {
	private String result;
	
	public void whoWon (String firstPlayer, String secondPlayer) {
		final String firstW = "First Player Wins!";
		final String secondW = "Second Player Wins!";
		final String tie = "Tie";
		
		//first player enters rock
		if (firstPlayer.equals("o")) {
			
			//second player enters paper
			if (secondPlayer.equals("-")) {
				
				//paper wins
				result = secondW;
			}
			
			//second player enters scissors
			else if (secondPlayer.equals("x")) {
				
				//rock wins
				result = firstW;
			
			}
			
			//tie if they both enter rock
			else
				result = tie;
		
			}
		//first player enters scissors
		else if (firstPlayer.equals("x")) {
			
			//second player enters paper
			if (secondPlayer.equals("-")) {
				
				//scissors win
				result = firstW;
			}
			
			//second player enters rock
			else if (secondPlayer.equals("o")) {
				
				//rock wins
				result = secondW;
			}
			
			//tie if they both enter scissors
			else
				result = tie;
			}
		
		//first player enters paper
		else if (firstPlayer.equals("-")) {
			
			//second player enters rock
			if (secondPlayer.equals("o")) {
				
				//paper wins
				result = firstW;
			}
			
			//second player enters scissors
			else if (secondPlayer.equals("x")) {
				
				//scissors wins
				result = secondW;
			}
			
			//tie if they both enter paper
			else
				result = tie;
		}
		
	}
	
	public String getResult () {
		return result;
	}
	

	

}
