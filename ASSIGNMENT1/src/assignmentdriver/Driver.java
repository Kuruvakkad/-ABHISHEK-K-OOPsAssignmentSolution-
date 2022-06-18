package assignmentdriver;

import assignmentAdmin.Admin;
import assignmentHR.Hr;
import assignmentTech.Tech;

public class Driver {

	public static void main(String[] args) {
		Admin obj= new Admin();
		Hr obj1= new Hr();
		Tech obj2= new Tech();
		obj.departmentName();
		obj.getTodaysWork();
		obj.getWorkDeadline();
		obj.isTodayAHoliday();
		System.out.println();
		obj1.departmentName();
		obj1.getTodaysWork();
		obj1.getWorkDeadline();
		obj1.doActivity();
		obj1.isTodayAHoliday();
		System.out.println();
		obj2.departmentName();
		obj2.getTodaysWork();
		obj2.getWorkDeadline();
		obj2.getTechStackInformation();
		obj2.isTodayAHoliday();

	}

}
