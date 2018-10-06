package com.kkmmyy94.www.mode;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author MyoungEun
 *
 * Mode is Connected to Interface.
 * Now interface is CLI that java supply for console output.
 */
public class MainModeImpl implements Mode {

	@Override
	public boolean init() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<? extends Object> run() {
		// TODO Auto-generated method stub
		
		System.out.println("WellCome to the game");
		List returnValue = new LinkedList();
		returnValue.add("0");
		return returnValue;
	}

}
