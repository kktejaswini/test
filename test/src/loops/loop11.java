package loops;

public class loop11 {
	public static void main(String[] args) {
		int startindex = Integer.parseInt(args[0]);
		int lastindex = Integer.parseInt(args[1]);
		for (int i = startindex ; i<lastindex ; i++) {
			if(i % 2==0) {
				System.out.println(i);
			}

	}

}
}
