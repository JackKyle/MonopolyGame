package artgameTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import artgame.Player;

class TestPlayer {

	int validBalance;
	String validName;

	@BeforeEach
	void setUp() throws Exception {
		validBalance = 1000;
		validName = "Name";

	}

	@Test
	void testConstructorNoArgs() {
		Player player = new Player();
		assertNotNull(player);
	}

	@Test
	void testConstructorWithArgs() {
		Player player = new Player(validName, validBalance);
		assertNotNull(player);
		assertEquals(player.getPlayerName(), validName);
		assertEquals(player.getPlayerBalance(), validBalance);
	}
	@Test
	void testPlayerNameGetterSetter() {
		Player player = new Player();
		player.setPlayerName(validName);
		assertEquals(player.getPlayerName(), validName);
	}
	
	@Test
	void testPlayerBalanceGetterSetter() {
		Player player = new Player();
		player.setPlayerBalance(validBalance);
		assertEquals(player.getPlayerBalance(), validBalance);
	}
	
}
