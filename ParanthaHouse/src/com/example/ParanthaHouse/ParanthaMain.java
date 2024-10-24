package com.example.ParanthaHouse;

public class ParanthaMain {

	public static void main(String[] args) {
		
		
		Parantha sadaParantha = new Parantha(true);
		
//		sadaParantha.addExtraButter();
//		sadaParantha.addExtraPickle();
//		sadaParantha.takeAway();
//		sadaParantha.getBill(); 
//		
          
		LavishParantha  lp= new LavishParantha (false);
		
		lp.takeAway();
		lp.getBill();
	}

}
