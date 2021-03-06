package kr.co.job.list;

public class Staff {
	private String name;
	private int age;
	private String title;
	private String empno;
	
	public Staff() {
		
	}
	
	public Staff (String name, int age, String title, String empno) {
		super();
		this.name = name;
		this.age = age;
		this.title = title;
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", title=" + title + ", empno=" + empno + "]";
	}

}
