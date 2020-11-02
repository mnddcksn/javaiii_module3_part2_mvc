package RockPaperScissors;

public class mvcRPS {

	public static void main(String[] args) {
		RockPaperScissorsModel theModel = new RockPaperScissorsModel();
		RockPaperScissorsView theView = new RockPaperScissorsView();
		RockPaperScissorsController theController = new RockPaperScissorsController(theView, theModel);
		
		theView.setVisible(true);

	}

}
