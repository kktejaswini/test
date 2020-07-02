package inheritence;

public class employee {
	private double annualsalary;
	private int yearofjoining;
	private String nationalInsuranceNo;
	
	 employee(String name,double annualsalary,int yearofjoining,String nationalInsuranceNo){
		
		super(name);
		this.annualsalary=annualsalary;
		this.yearofjoining=yearofjoining;
		this.nationalInsuranceNo=nationalInsuranceNo;
	}
	
	void display() {
		
		System.out.println("Name : "+name+"\n"+"Annual Salary : "+annualsalary+"\n"+"Year Of joining : "+yearofjoining+"\n"+"National Id : "+nationalInsuranceNo);
		
	}
}
