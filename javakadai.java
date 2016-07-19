import java.util.*;

class JavaKadai054{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		int Month;

		System.out.printf("ŒŽ‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢-->");
		Month = stdin.nextInt();

		if(Month > 1 && Month < 13){
			if(Month == 1 || Month == 2 || Month == 12){
				System.out.println("“~‚Å‚·");
			}else if(Month == 4 || Month == 5 || Month == 3){
				System.out.println("t‚Å‚·");
			}else if(Month == 7 || Month == 8 || Month == 6){
				System.out.println("‰Ä‚Å‚·");
			}else
				System.out.println("H‚Å‚·");
		}else{
				System.out.println("ƒGƒ‰[: ‚P`‚P‚Q‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		}


	}
}
