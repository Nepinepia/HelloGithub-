import java.util.*;

class JavaKadai054{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		int Month;

		System.out.printf("������͂��Ă�������-->");
		Month = stdin.nextInt();

		if(Month > 1 && Month < 13){
			if(Month == 1 || Month == 2 || Month == 12){
				System.out.println("�~�ł�");
			}else if(Month == 4 || Month == 5 || Month == 3){
				System.out.println("�t�ł�");
			}else if(Month == 7 || Month == 8 || Month == 6){
				System.out.println("�Ăł�");
			}else
				System.out.println("�H�ł�");
		}else{
				System.out.println("�G���[: �P�`�P�Q����͂��Ă�������");
		}


	}
}
