package com.kkmmyy94.www.mode;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class IdleModeImpl implements Mode {

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<? extends Object> run() {
		// TODO Auto-generated method stub
		walk();
		List returnValue = new LinkedList();
		returnValue.add("0");
		return returnValue;
	}
	
	private Integer walk() {
		//System.out.printf("");
		return walkTemp();
		
	}
	private Integer walkTemp() {
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Are you want walk?");
			System.out.println("");
		    String data = sc.nextLine();
			System.out.println("walk..");
			System.out.println("walk..");

			//random
			if (isUserMetMosnter()) {
				//Battle
				System.out.println("you meeet Some Enermy!!");
				//TODO
				return 1;
			}
			//Idle no touch
		}
	}
	
	private Boolean isUserMetMosnter()
	{
		Random random = new Random();
		int maxRandomInt = 10;
		
		
		if(random.nextInt(maxRandomInt)>5)
		{
			return true;
		}
		else return false;
	}
}
