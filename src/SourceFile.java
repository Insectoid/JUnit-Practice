
public class SourceFile {
	
	// Simple method
	public static double addByHalf(double num) {
		return num + (num/2);
	}
	
	// More complex method taken from a prior assignment. Original comment is below:
	/* Takes a int[] representing a team's scores over all innings,
	 and returns the total runs. */
	public static int gameScore(int[] teamBoxScore) {
		int output = 0;
		for (int i : teamBoxScore) {
			if (i != -999) {
				output += i;
			}
		}
		return output;
	}
	
}
