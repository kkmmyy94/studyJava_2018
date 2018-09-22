package com.kkmmyy94.www.data.result.mode;

public enum EnumModeResult {
	Success_ ("1",true),
	Fail_ ("0", false)
	//fail,
	//successWithDataChange,
	//failWithDataChange
	;
	
	private String tableValue;
	private boolean table2Value;
	
	EnumModeResult(String tableValue, boolean table2Value){
		this.tableValue = tableValue;
		this.table2Value = table2Value;
	}
}
