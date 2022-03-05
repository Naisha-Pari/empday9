package empoloyeeD10;

public class useCase9 {
public static final int is_part_time=1;
public static final int is_full_time=2;

private final String company;
private final int empRatePerHour;
private final int numOfWorkingDays;
private final int maxHoursPerMonth;
private int totalempwage;

public useCase9(String company, int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
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
		public static void main(String[] args){
			useCase9 dMart=new useCase9("DMart",20,2,2);
			useCase9 reliance=new useCase9("Reliance",20,2,2);
			dMart.computeWage();
			System.out.println(dMart);
			reliance.computeWage();
			System.out.println(reliance);
}
}
