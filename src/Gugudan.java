import java.util.Scanner; //class import


public class Gugudan {
	public static void main(String[] args) {
	
		//2단		
//		System.out.println("2단이지롱");
//		System.out.println(2*1);
//		System.out.println(2*2); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(2*3); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(2*4); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(2*5); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(2*6); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(2*7); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(2*8); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(2*9); //ctrl+alt+아래화살표하면 그 줄 복사됨
// 한 번에 주석처리하기 ctrl+/
	
		//3단
//		System.out.println("3단입니다아"); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(3*1); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(3*2); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(3*3); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(3*4); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(3*5); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(3*6); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(3*7); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(3*8); //ctrl+alt+아래화살표하면 그 줄 복사됨
//		System.out.println(3*9); //ctrl+alt+아래화살표하면 그 줄 복사됨
		
		
		//4단				
//		int result=4*1;
//		System.out.println(result);
//		result=4*2;
//		System.out.println(result);
//		result=4*3;
//		System.out.println(result);
//		result=4*4;
//		System.out.println(result);
//		result=4*5;
//		System.out.println(result);
//		result=4*6;
//		System.out.println(result);
//		result=4*7;
//		System.out.println(result);
//		result=4*8;
//		System.out.println(result);
//		result=4*9;
//		System.out.println(result);
		
		//5단
//		int num=5;
//		int res2=num*1;
//		System.out.println(res2);
//		res2=num*2;
//		System.out.println(res2);
//		res2=num*3;
//		System.out.println(res2);
//		res2=num*4;
//		System.out.println(res2);
//		res2=num*5;
//		System.out.println(res2);
//		res2=num*6;
//		System.out.println(res2);
//		res2=num*7;
//		System.out.println(res2);
//		res2=num*8;
//		System.out.println(res2);
//		res2=num*9;
//		System.out.println(res2);
//	
//		System.out.println("출력할 단: ");
//		Scanner input=new Scanner(System.in); //사용자가 값을 입력
//		int number=input.nextInt(); //입력값은 정수
//		System.out.println("number: "+number);
		
		
//		System.out.println(number*1);
//		System.out.println(number*2);
//		System.out.println(number*3);
//		System.out.println(number*4);
//		System.out.println(number*5);
//		System.out.println(number*6);
//		System.out.println(number*7);
//		System.out.println(number*8);
//		System.out.println(number*9);
		
		
		
		
//		int res=number*1;
//		System.out.println(res);
//		res=number*2;
//		System.out.println(res);
//		res=number*3;
//		System.out.println(res);
//		res=number*4;
//		System.out.println(res);
//		res=number*5;
//		System.out.println(res);
//		res=number*6;
//		System.out.println(res);
//		res=number*7;
//		System.out.println(res);
//		res=number*8;
//		System.out.println(res);
//		res=number*9;
//		System.out.println(res);
	
//		System.out.println("값을 입력하세요: ");
//		Scanner scanner=new Scanner(System.in); //객체생성
//		int number=scanner.nextInt(); //scanner의 메소드
//		System.out.println("number: "+number);
//		
//		if (number<2) {
//			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
//		} else if (number>9) {
//			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");	
//		} else {
//			int i=1;
//			while(i<10) {
//				System.out.println(number*i);
//				i+=1; //i++와 같음
//			}
//			
//			for(int j=1; j<10; j++) {
//				System.out.println(number*j);
//			}
//		}		

		
		//배열로 구구단 구현
		int[] gugu=new int[9];
		for(int i=0; i<gugu.length; i++) {
			System.out.println((i+1)+"단 출력 시작");
			for(int j=1; j<10; j++) {
				gugu[i]=(i+1)*j;
				System.out.println((i+1)+"*"+j+"="+gugu[i]);
			}
		}
		System.out.println(gugu[1]);
		
		
		
		
		}
}
