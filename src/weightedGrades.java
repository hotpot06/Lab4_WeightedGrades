import java.util.Scanner;

public class weightedGrades {
	private int attribute;
	private int[] pointTotal;
	private int[] earnedPoints;
	private double[] assignmentPercentage;
	private double totalWeightedGrade;
	
	public weightedGrades() {
		Scanner sc = new Scanner(System.in);
		attribute = sc.nextInt();
		pointTotal = new int[attribute];
		earnedPoints = new int[attribute];
		assignmentPercentage = new double[attribute];
		
		for (int j = 0; j < attribute; j = j + 1) {
			int total = sc.nextInt();
			System.out.print(total + " ");
			pointTotal[j] = total;
		}

		for (int k = 0; k < attribute; k = k + 1) {
			int earned = sc.nextInt();
			System.out.print(earned + " ");
			earnedPoints[k] = earned;
		}

		for (int l = 0; l < attribute; l = l + 1) {
			double percentage = sc.nextDouble();
			System.out.print(percentage + " ");
			assignmentPercentage[l] = percentage;
		}
		sc.close();
	}
	
	public void gettotalWeightedGrades() {
		totalWeightedGrade = 0.0;
		for(int i = 0; i < attribute; i = i + 1) {
			totalWeightedGrade = totalWeightedGrade + assignmentPercentage[i] * earnedPoints[i] / pointTotal[i];
		}
		
		String gradeLetter;
		if(totalWeightedGrade < 60) {
			gradeLetter = "F";
		}else if(totalWeightedGrade >= 60 && totalWeightedGrade < 70) {
			gradeLetter = "D";
		}else if(totalWeightedGrade >= 70 && totalWeightedGrade < 80) {
			gradeLetter = "C";
		}else if(totalWeightedGrade >= 80 && totalWeightedGrade < 90) {
			gradeLetter = "B";
		}else {
			gradeLetter = "A";
		}
		String num1  = String.format("%.3f",totalWeightedGrade);
		System.out.println('\n'+"Total weighted grades: "+num1+", the garde letter: "+gradeLetter);
	}
}
