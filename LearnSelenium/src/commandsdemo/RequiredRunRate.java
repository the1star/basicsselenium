package commandsdemo;

public class RequiredRunRate {

	public static void main(String[] args) {
		RequiredRunRate obj = new RequiredRunRate();
		double result =obj.runrateRequired(326,49,210,33);
		System.out.println(result);
	}
	public double runrateRequired(int target, int maxOver, int currentScore, int oversBowled)
	{
		double remainingOvers = maxOver - oversBowled;
		double remainingRuns = target - currentScore;
		return (remainingRuns/remainingOvers);
	}

}
