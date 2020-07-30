
public class ClassGugu {
	//메인 메소드를 별도의 클래스로 분리
	//메소드 활용해 구구단 구현
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			int[] result=MethodGugu2.calculate(i); //다른 클래스에서 호출하고 있으므로 클래스 명을 언급
			System.out.println(i+"단 시작");
			MethodGugu2.print(result);
		}
	}
}
