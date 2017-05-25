import static org.junit.Assert.*;
import org.junit.Test;

public class SourceFileTest {

	@Test
	public void testAddByHalf() {
		assertEquals(0, SourceFile.addByHalf(0), 0.1);
		assertEquals(1.5, SourceFile.addByHalf(1), 0.1);
		assertEquals(3, SourceFile.addByHalf(2), 0.1);
		assertEquals(-3, SourceFile.addByHalf(-2), 0.1);
	}
	
	@Test
	public void testGameScore(){
		// Set up
		int [ ] teamScore;
		teamScore = new int [20];
		for (int k = 0; k < teamScore.length; k++) {
			teamScore[k] = -999;
		}
		
		// Testing
		assertEquals(0, SourceFile.gameScore(teamScore));
		
		teamScore[0] = 12;
		assertEquals(12, SourceFile.gameScore(teamScore));
		
		teamScore[1] = 2;
		assertEquals(14, SourceFile.gameScore(teamScore));
		
		for (int k = 0; k < teamScore.length; k++) {
			teamScore[k] = k;
		}
		assertEquals(teamScore.length * (teamScore.length - 1) / 2, SourceFile.gameScore(teamScore));
	}

}
