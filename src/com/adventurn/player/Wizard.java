package com.adventurn.player;

public class Wizard extends Warrior {

	enum Spells{
		WINDBURST(1, 30),
		FIREBALL(5, 50),
		EARTHQUAKE(10, 100);
		int level, damage;
		
		
		private Spells(int level, int damage)
		{
			this.level = level;
			this.damage = damage;
		}
	}
	Spells spells;
	
	
}
