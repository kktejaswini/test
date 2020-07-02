package loops;

public class loop6 {
	public static void main(String[] args) {
		String gender=args[0];
				
				int age=Integer.parseInt(args[1]);
				if (gender.equals("female") && age>=1 && age<=58) {
					System.out.println("percentage of interst is 8.2%");
				}
				else if(gender.equals("male") && age>=1 && age<=58){
					System.out.println("percentage of interst is 8.4%");
				}
				  else if(gender.equals("female") && age>=59 && age<=100) {
					System.out.println("percentage of interst is 9.2%");	
				}
				
				else {
					System.out.println("percentage of interst is 10.5%%");
				}

			}
}
