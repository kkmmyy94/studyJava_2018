package com.kkmmyy94.www.mode;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.kkmmyy94.www.data.monster.MonsterDataImpl;
import com.kkmmyy94.www.data.monster.MonsterData;

public class BattleModeImpl implements Mode {

	MonsterData userData;
	MonsterData MonsterData;
	
	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		userData = new MonsterDataImpl();
		userData.init();
		MonsterData = new MonsterDataImpl();
		MonsterData.init();
		return true;
	}

	@Override
	public List<? extends Object> run() {
		// TODO Auto-generated method stub
		List returnValue = new LinkedList();
		returnValue.add("0");
		return returnValue;
	}
	
	private void battleInit() {
		
		if(userData == null || MonsterData == null) init();
		
	}
	
	private void battlePvE() {
		
		attack();
		
		//switch attack result
		
		//get Monster
		
		//print result
		printResult();
		//End BattleMode
		
	}
	
	private void getMonsterWhenUserWin() {
		//Are you want throw MonsterBall?
		
		//User throw
		
		//check  User Can get monster really 
		
		//if get Monster and return 
		
		//else return result value
		
	}
	
	private void printResult() {
		//readd Rersult
		
		//print result
		
		
	}
	
	private int attack() {
		//LoopBegin
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("PLEASE Select next you action.");
			String data = sc.nextLine();
			System.out.println("Attack");
			attackMonster(userData,MonsterData);
			
			if(MonsterData.getHP() <= 0) {
				System.out.println("Now Enermy falls!!!");
				System.out.println("YOU are WIN!");
				return 1;
			}
			System.out.println("Now Enermy's HP is " +  MonsterData.getHP() );
			System.out.println("now Enermy ATTACK your monster");
			attackMonster(MonsterData,userData);
			if(userData.getHP() <= 0)
			{
				System.out.println("Your monster falls!!!");
				System.out.println("YOU are loose....");
				return 0;
			}
		}
		//return 0;
	}
	
	private void attackMonster(MonsterData attacker, MonsterData deffencer)
	{
		int hpOfDeffencer = deffencer.getHP() - attacker.getAttackPoint();
		if(hpOfDeffencer >= 0)deffencer.setHP(hpOfDeffencer);
		else deffencer.setHP(0);
	}

}
