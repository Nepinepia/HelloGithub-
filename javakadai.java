import java.util.*;

class JavaKadai054{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		int Month;

		System.out.printf("月を入力してください-->");
		Month = stdin.nextInt();

		if(Month > 1 && Month < 13){
			if(Month == 1 || Month == 2 || Month == 12){
				System.out.println("冬です");
			}else if(Month == 4 || Month == 5 || Month == 3){
				System.out.println("春です");
			}else if(Month == 7 || Month == 8 || Month == 6){
				System.out.println("夏です");
			}else
				System.out.println("秋です");
		}else{
				System.out.println("エラー: １〜１２を入力してください");
		}


	}
}
