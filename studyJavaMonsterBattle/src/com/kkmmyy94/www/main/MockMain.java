package com.kkmmyy94.www.main;

import java.util.List;

import com.kkmmyy94.www.mode.*;

public class MockMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainModeImpl mainMode = new MainModeImpl();
		mainMode.init();
		List mainResultList =mainMode.run();
		
		IdleModeImpl idleMode = new IdleModeImpl(); 
		List idleResultList;
		
		BattleModeImpl battleMode = new BattleModeImpl();
		List battleResultList;
		
		
		if(mainResultList.get(0)=="0")
		{
			idleMode.init();
			idleResultList = idleMode.run();
			
			if(idleResultList.get(0)=="0")
			{
				battleMode.init();
				battleResultList = battleMode.run();
				
				if(battleResultList.get(0)=="0") { System.out.println("you Win"); return;}
				else if(battleResultList.get(0)=="1") {
					System.out.println("you loose");
					return;	
				} 
					
				
			}
			
			
		}
		
	}

}
