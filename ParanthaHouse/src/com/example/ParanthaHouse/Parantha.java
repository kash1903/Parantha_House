package com.example.ParanthaHouse;

public class Parantha {
	
	private int price;
	private Boolean veg;
	
	private int ExtraButter=50;
	private int ExtraPickle=45;
	private int BackPack=20;
	
	private int SadaParanthaPrice;
	
	private Boolean isExtraButterAdded=false;
	private Boolean isExtraPickleAdded=false;
	private Boolean isOptedForTakeAway=false;
	
	
  
	public Parantha(Boolean veg) {
		
		this.veg= veg;
		
		if(this.veg) {  // Veg Parantha 
			
			this.price = 100;
			
		}
		
		else {          // Non Veg Parantha 
			
			this.price = 200;  
		}
		SadaParanthaPrice = this.price;
	}
	
	public void addExtraButter() {
		
		isExtraButterAdded=true;
		//System.out.println("Extra Butter Added");
		this.price+=ExtraButter;
		
	}
	
	public void addExtraPickle() {
		
		isExtraPickleAdded=true;
		//System.out.println("Extra Pickle Added");
		this.price+=ExtraPickle;
		
	}
	
	public void takeAway() {
		
		isOptedForTakeAway=true;
		//System.out.println("CarryBag Added");
		this.price+=BackPack;
		
	}
     
	public void getBill() {
		
		String bill="";
		
		System.out.println("Parantha : " + SadaParanthaPrice);
		
		if(isExtraButterAdded==true) {
			
			bill+="Extra Butter Added : "+ExtraButter + "\n" ;
			
		}
		
		if(isExtraPickleAdded) {
			bill+="Extra Pickle Added : "+ExtraPickle + "\n" ;
		}
		
		if(isOptedForTakeAway) {
			bill+="Take_Away Opted : "+BackPack + "\n";
		}
		
		bill+= "Bill : " + this.price + "\n";
		System.out.println(bill);

	}
}
