package com.kkmmyy94.www.data.monster;

public class MonsterDataImpl implements MonsterData{

	private String monsterName;
	private int monsterHP;
	private int monsterAttackPoint;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		monsterName = "DefaultNameMonster";
		monsterHP = 1;
		monsterAttackPoint = 1;
	}
	
	public void init(String name, int hp, int ap) {
		// TODO Auto-generated method stub
		monsterName = name;
		monsterHP = hp;
		monsterAttackPoint = ap;
	}
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return monsterName;
	}

	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return monsterHP;
	}

	@Override
	public void setHP(int newHP) {
		// TODO Auto-generated method stub
		monsterHP = newHP;
	}

	@Override
	public int getAttackPoint() {
		// TODO Auto-generated method stub
		return monsterAttackPoint;
	}

}
