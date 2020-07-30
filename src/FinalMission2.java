import java.util.Scanner;
public class FinalMission2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("정수 두 개 입력:");
		String inputValue=scanner.nextLine();
		
		//입력값을 쉼표 기준으로 분리
		String[] splitedValue=inputValue.split(",");
		//분리한 문자열을 숫자로 변환
		int first=Integer.parseInt(splitedValue[0]);
		int second=Integer.parseInt(splitedValue[1]);
				
		for(int i=2; i<=first; i++) {
			System.out.println(i+"단 시작");
			for(int j=1; j<=second; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
