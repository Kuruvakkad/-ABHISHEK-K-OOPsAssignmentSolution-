package assignmentHR;

import assignmentSuperClass.SuperClass;

public class Hr extends SuperClass {
	String departmentName;
	String getTodaysWork;
	String getWorkDeadline;
	String doActivity;

	public void departmentName() {

		System.out.println("Welcome to HR Department");

	}

	public void getTodaysWork() {

		System.out.println("Fill today’s worksheet and mark your attendanc");

	}

	public void getWorkDeadline() {

		System.out.println("Complete by EOD");

	}

	public void doActivity() {
		System.out.println("Team Lunch");
	}

}
