package com.kkmmyy94.www.mode;
import java.util.List;

public interface Mode {

	boolean init();
	List<? extends Object> run();
	
}
