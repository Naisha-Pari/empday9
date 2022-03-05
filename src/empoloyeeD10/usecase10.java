package empoloyeeD10;

import java.util.ArrayList;
import java.util.List;

public class usecase10 {
	public static final int is_part_time=1;
	public static final int is_full_time=2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalempwage;

	public usecase10(String company, int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
	this.company=company;
	this.empRatePerHour=empRatePerHour;
	this.numOfWorkingDays=numOfWorkingDays;
	this.maxHoursPerMonth=maxHoursPerMonth;
	}
	public void computeWage(){
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<=numOfWorkingDays)
		{
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()*10) % 3;
			switch (empCheck) {
			case is_part_time:
				empHrs=4;
				break;
			case is_full_time:
				empHrs=8;
				break;
				default:
					empHrs=0;
			}
			totalEmpHrs += empHrs;
			System.out.println("day:" + totalWorkingDays + "emphrs:" +empHrs);
			}
		totalempwage = totalEmpHrs * empRatePerHour ;
			
	}
	public String toString(){
		 return "total emp wage:" +company+"is;"+ totalempwage;
			}
	public static void main (String[] args){
	 List<usecase10> list=new ArrayList<usecase10>();
	 usecase10 c1=new usecase10("dmart",8,2,100);  
	 usecase10 c2=new usecase10("reliance",8,2,80);
	 //adding list to company
	    list.add(c1);  
	    list.add(c2);
//traversing the list
	    for(usecase10 c:list)
	    {
	    	System.out.println(c.company+" "+c.empRatePerHour+" "+c.numOfWorkingDays+" "+c.maxHoursPerMonth);
	    }
	}
}