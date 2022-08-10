package com.bridgelabz;
public class EmpWage {
	public static final	int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final	int NUM_WORKING_DAYS = 20;
	public static final int WORKING_HRS_IN_MONTH = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Pgm");
		/*
		 * UC6 : calculate wages till number of working hrs per month or number of working days is reached 
		 */
		int empHrs,totalEmpWage,totalEmpHrs=0,totalWorkingDays=0;
	    while(totalEmpHrs<=WORKING_HRS_IN_MONTH && totalWorkingDays<NUM_WORKING_DAYS)
	    {	
	    	totalWorkingDays++;		
	    
	    int empcheck = (int) (Math.floor(Math.random()*10)%3);
		switch(empcheck) {
		case IS_FULLTIME:
		    empHrs = 8;
			System.out.println("Emp is full time present");
			break;
		case IS_PARTTIME:
			empHrs = 4;
			System.out.println("Emp is part time present");
			break;
		default :
			empHrs = 0;
		    System.out.println("Emp is Absent");
		}
		totalEmpHrs +=empHrs;
		 System.out.println(" Day:"+totalWorkingDays  +  " Total EmpHours:"+totalEmpHrs);
	    }
	    totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
	    System.out.println("Total Emp Wage Is:"+totalEmpWage);
	    }

}
