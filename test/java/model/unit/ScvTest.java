package model.unit;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import model.Resources;

public class ScvTest {

	private Scv subject;

	@Before
	public void setUp() {
		subject = new Scv();
	}

	@Test
	public void update_resourceTimeNot0_reducesCorrectly() {
		// Arrange

		// Act
		subject.update();

		// Assert
		int secondsToReturnCrystal = subject.getSecondsToReturnCrystal();
		Assert.assertEquals("Remaining Time is wrong.", 4, secondsToReturnCrystal);
	}

	@Test
	public void update_resourceTime1() throws Exception {
		// Arrange

		// Act
		for (int i = 0; i < Scv.TIME_TO_MINE; i++) {
			subject.update();
		}

		// Assert
		int result = subject.getSecondsToReturnCrystal();
		assertEquals("Remaining time should have been resetted.", Scv.TIME_TO_MINE, result);
	}

	@Test
	public void collectedResourcesThisTurn_OneUpdate_None() throws Exception {
		// Arrange

		// Act
		subject.update();

		// Arrange
		Resources result = subject.getCollectedResourcesThisTurn();
		assertEquals("Should not have collected anything.", new Resources(0, 0), result);
	}

	@Test
	public void collectedResourcesThisTurn_fiveUpdates_returnsResources() {
		// Arrange

		// Act
		for (int i = 0; i < Scv.TIME_TO_MINE; i++) {
			subject.update();
		}

		// Assert
		Resources result = subject.getCollectedResourcesThisTurn();
		assertEquals("Scv returned the wrong number of resources.", new Resources(5, 0), result);

	}

}
