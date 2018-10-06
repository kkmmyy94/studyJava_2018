package com.kkmmyy94.www.mode;

import java.util.LinkedList;
import java.util.List;

public class BattleModeImpl implements Mode {

	Object userData;
	Object MonsterData;
	
	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<? extends Object> run() {
		// TODO Auto-generated method stub
		List returnValue = new LinkedList();
		returnValue.add("0");
		return returnValue;
	}
	
	private void battleInit() {
		//Set userData
		//set MonsterData
	}
	
	private void battlePvE() {
		
		attack();
		
		//switch attack result
		
		//get Monster
		
		//print result
		
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
	
	private void attack() {
		//LoopBegin
		
		//user want Attack?
		//Attack
		//Is enermy Lived?
		//Attack
		
		//Loop End
		
		//return ResultValue
	}

}
