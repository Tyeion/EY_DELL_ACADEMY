package com.pardeep.Tyeion16Aug;

public class IndianTeam implements ISports,IFootball,IHockey {

	@Override
	public void setVenue(String place) {
		// TODO Auto-generated method stub
		System.out.println("Visiting team is "+ place);
		
	}

	@Override
	public void setVisitingTeam(String place) {
		// TODO Auto-generated method stub
		System.out.println("Visiting team is "+ place);
		
	}

	@Override
	public void setHomeTeam(String place) {
		// TODO Auto-generated method stub
		System.out.println("qurters played "+ place);
	}

	@Override
	public void goalsAwayTeamScored() {
		// TODO Auto-generated method stub
		System.out.println("Football method");
		
	}

	@Override
	public void golasHomeTeamScored() {
		// TODO Auto-generated method stub
		System.out.println("Football method");
	}

	@Override
	public void quarterOfPlay() {
		// TODO Auto-generated method stub
		System.out.println("Football method");
	}

	@Override
	public void teamForHockey() {
		// TODO Auto-generated method stub
		System.out.println("Hockey method");
	}

	@Override
	public void ScoreForHockey() {
		// TODO Auto-generated method stub
		System.out.println("Hockey method");
	}
	
	public static void main(String[] args) {
		IndianTeam i=new IndianTeam();
	
	}

}
