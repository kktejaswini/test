package loops;

public class loop8 {
	public static void main(String[] args) {
		char ch=args[0].charAt(0);
		switch (ch) {
		case 'R':
			System.out.println("RED");
			break;
		case 'B':
			System.out.println("BLUE");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'Y':
			System.out.println("YELLOW");
			break;
		case 'O':
			System.out.println("ORANGE");
			break;
		case 'W':
			System.out.println("white");
			break;
		default:
			System.out.println("invalid case");
			
		}

	}
}
