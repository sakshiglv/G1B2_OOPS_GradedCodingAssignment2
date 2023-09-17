package com.greatlearning.departmentdriverapp;

import com.greatlearning.departments.AdminDepartment;
import com.greatlearning.departments.HrDepartment;
import com.greatlearning.departments.SuperDepartment;
import com.greatlearning.departments.TechDepartment;

public class DrepartmenDriver {

	public static void main(String[] args) {
		AdminDepartment a = new AdminDepartment();
		System.out.println("Welcome to "+a.departmentName());
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadline());
		System.out.println(a.isTodayAHoliday());
		System.out.println();
		
		
		HrDepartment h = new HrDepartment();
		System.out.println("Welcome to "+h.departmentName());
		System.out.println(h.doActivity());
		System.out.println(h.getTodaysWork());
		System.out.println(h.getWorkDeadline());
		System.out.println(h.isTodayAHoliday());
		System.out.println();
		
		
		TechDepartment t = new TechDepartment();
		System.out.println("Welcome to "+t.departmentName());
		System.out.println(t.getTodaysWork());
		System.out.println(t.getWorkDeadline());
		System.out.println(t.getTechStackImformation());
		System.out.println(t.isTodayAHoliday());
		
		

	}

}
