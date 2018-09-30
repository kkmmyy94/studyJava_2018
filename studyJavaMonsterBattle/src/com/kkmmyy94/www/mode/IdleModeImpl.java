package com.kkmmyy94.www.mode;

import java.util.List;
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
		return null;
	}
	
	private void walk() {
		//System.out.printf("");
		walkTemp();
	}
	private void walkTemp() {
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Are you want walk?");
			System.out.println("");
		    String data = sc.nextLine();
			System.out.println("walk..");
			System.out.println("walk..");
			//TODO random
			int randomInt = 0;
			//random
			if (randomInt == 1) {
				//Battle
				System.out.println("you meeet Some Enermy!!");
				//TODO
				break;
			}
			//Idle no touch
		}
	}
}
