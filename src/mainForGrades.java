import java.util.Scanner;

public class mainForGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Input the number of attribute, total points, earned points and assignment percentage: ");
		weightedGrades weightedgrades;
		//input data
		weightedgrades = new weightedGrades();

		// calculate
		weightedgrades.gettotalWeightedGrades();
	}

}
