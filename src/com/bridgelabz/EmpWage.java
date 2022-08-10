package com.bridgelabz;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Pgm");
		int IS_FULLTIME = 1;
		int IS_PARTTIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs;
		int empWage;
		/*
		 * UC1 : check employee attendance
		 */

		double empcheck=Math.floor(Math.random()*10)%3;
		if(empcheck == IS_FULLTIME)
		{
			empHrs = 8;
			System.out.println("Emp is full time present");
		}
		/*
		 * UC3 : to check employee is full time or part time 
		 */
		else if(empcheck == IS_PARTTIME)
		{
			empHrs = 4;
			System.out.println("Emp is part time present");
			
		}
	
		else 
		{
			empHrs = 0;
			System.out.println("Emp is absent");
		}
		/*
		 * UC2 : calculate daily employee wage
		 */
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage:"+empWage);
		
	}
}
