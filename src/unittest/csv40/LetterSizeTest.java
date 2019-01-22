package unittest.csv40;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.*;

import edu.vcccd.vc.csv40.LetterSize;

public class LetterSizeTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	private static final int maximumScore = 20;
	private static final int maximumAssignmentScore = 25;
	private static int totalScore;

	@Before
	public void beforeTest() {
		System.setOut(new PrintStream(outContent));
		//System.setErr(new PrintStream(errContent));
	}

	@After
	public void afterTest() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}

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
	public void testLetterSize() throws Exception {
		LetterSize.main(null);
		Matcher m = Pattern.compile(".*215\\.90\\D*279\\.40\\D*").matcher(outContent.toString());
		assertTrue(m.matches());
		totalScore += 20;
	}
}