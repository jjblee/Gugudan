import java.util.Scanner;
public class FinalMission1 {
	public static void main(String[] args) {
		//사용자로부터 값 입력받기
		Scanner scanner=new Scanner(System.in);
		System.out.println("정수 입력: ");
		int times=scanner.nextInt();
		
		//구구단 로직
		for(int i=2; i<(times+1); i++) {
			System.out.println();
			System.out.println(i+"단 출력");
			for(int j=1; j<(times+1); j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
	}
}
