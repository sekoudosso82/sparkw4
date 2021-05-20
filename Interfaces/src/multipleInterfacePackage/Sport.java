package multipleInterfacePackage;

//Filename: Sports.java

public interface Sport {
	
	public void setHomeTeam(String name);
	public void setVisitingTeam(String name);
}
//Filename: Football.java

interface Football extends Sport {
	
	public void homeTeamScored(int points);
	public void visitingTeamScored(int points);
	public void endOfQuarter(int quarter);
}

//Filename: Hockey.java
//Extending Multiple Interfaces
//public interface Hockey extends Sports, Event
interface Hockey extends Sport {

	public void homeGoalScored();
	public void visitingGoalScored();
	public void endOfPeriod(int period);
	public void overtimePeriod(int ot);
}
/*
 	The Hockey interface has four methods, but it inherits two from Sports. 
 	Thus, a class that implements Hockey needs to implement all six methods. 
 	Similarly, a class that implements Football needs to define the three 
 	methods from Football and the two methods from Sports.  
  
 * */
