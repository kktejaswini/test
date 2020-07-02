package loops;

public class rangeprime {
	public static void main(String[] args) {
		int startindex = Integer.parseInt(args[0]);
		int lastindex = Integer.parseInt(args[1]);
		
		for (int i = startindex ; i <= lastindex ; i++) {
			int c=0;
			for(int j = 2 ; j < i; j++) {
				
				if (i % j==0) {
					c+=1;
				}	
			}
			if(c==0) {
				System.out.println(i);
			}

	}

}
}
