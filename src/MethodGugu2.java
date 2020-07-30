
public class MethodGugu2 {
	//계산 결과를 배열에 저장
	public static int[] calculate(int times) {
		int[] result=new int[9];
		for(int i=0; i<result.length; i++) {
			result[i]=times*(i+1);	
		}
		return result;
	}
	
	
	//계산 결과를 화면에 출력
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	//메인 메소드가 없으면 실행할 수 없음
//	public static void main(String[] args) {
//		for(int i=2; i<10; i++) {
//			int[] result=calculate(i); //같은 클래스에서 호출하고 있음.
//			System.out.println(i+"단 시작");
//			print(result);
//		}
//	}
}
