package org.pickem.services;

import java.util.Arrays;
import java.util.List;

import org.pickem.model.Game;
import org.springframework.stereotype.Service;

@Service
public class GameRepository {

	public List<Game> fetchGamesByWeek(){
		Game game1 = new Game();
		game1.setHomeName("packers");
		Game game2 = new Game();
		game2.setHomeName("chiefs");
		
		return Arrays.asList(game1, game2);
	}
	
}
