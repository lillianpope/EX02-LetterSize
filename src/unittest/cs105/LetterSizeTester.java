package unittest.cs105;

import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.LetterSize;

public class LetterSizeTester {
	private static final int maximumScore = 4;
	private static final int maximumAssignmentScore = 4;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {

		if (totalScore == maximumScore) {
			System.out.printf("Your unit test score is %d out of %d.\n\n", totalScore, maximumScore);
		} else {
			System.out.printf("Your unit test score is %d out of %d (%d).\n\n", totalScore, maximumScore,
					totalScore - maximumScore);
		}

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void testHelloWorld() throws Exception {
		assertTrue(Pattern.matches(".*215\\.90[\\D].*279\\.40([\\D].*)?", LetterSize.computeLetterSize()));
		totalScore += 4;
	}
}