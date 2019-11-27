package ResultsCalculator;

public class Calculator {

	public static void results(int biology, int chemistry, int physics) {
		int totalMark = biology + chemistry + physics;
		System.out.println("Biology: " + biology);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Physics: " + physics);
		System.out.println("Total mark: " + totalMark);
	}
	
	public static void percentage(int biology, int chemistry, int physics) {
		double totalMark = biology + chemistry + physics;
		double overallPercentage = (totalMark*100)/450;
		double biologyPercentage = (biology*100)/150;
		double chemistryPercentage = (chemistry*100)/150;
		double physicsPercentage = (physics*100)/150;
		
		if (overallPercentage < 60) {
			System.out.println("FAIL! Overall percentage: " + overallPercentage);
		}
		else {
			if ((biologyPercentage < 60) && (chemistryPercentage >= 60) && (physicsPercentage >= 60)){
				System.out.println("FAIL! Biology is less than 60%.");
			}
			else if ((biologyPercentage >= 60) && (chemistryPercentage < 60) && (physicsPercentage >= 60)){
				System.out.println("FAIL! Chemistry is less than 60%.");
			}
			else if ((biologyPercentage >= 60) && (chemistryPercentage >= 60) && (physicsPercentage < 60)){
				System.out.println("FAIL! Physics is less than 60%.");
			}
			else if ((biologyPercentage < 60) && (chemistryPercentage < 60) && (physicsPercentage >= 60)){
				System.out.println("FAIL! Biology and Chemistry are less than 60%.");
			}
			else if ((biologyPercentage >= 60) && (chemistryPercentage < 60) && (physicsPercentage < 60)){
				System.out.println("FAIL! Physics and Chemistry are less than 60%.");
			}
			else if ((biologyPercentage < 60) && (chemistryPercentage >= 60) && (physicsPercentage < 60)){
				System.out.println("FAIL! Biology and Physics are less than 60%.");
			}
			else if ((biologyPercentage < 60) && (chemistryPercentage < 60) && (physicsPercentage < 60)){
				System.out.println("FAIL! All exams are less than 60%.");
			}
			else {
				System.out.println("PASS! Overall percentage: " + overallPercentage);
			}

		}
	
	}
	


}
