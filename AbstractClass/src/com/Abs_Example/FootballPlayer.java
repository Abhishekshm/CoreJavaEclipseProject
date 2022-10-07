package com.Abs_Example;

public class FootballPlayer extends Player {

	@Override
	public boolean checkPlayer(Player p) {

		if (p.getAge() > 19)
			return true;
		else
			return false;

	}

}
