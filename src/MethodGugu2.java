
public class MethodGugu2 {
	//��� ����� �迭�� ����
	public static int[] calculate(int times) {
		int[] result=new int[9];
		for(int i=0; i<result.length; i++) {
			result[i]=times*(i+1);	
		}
		return result;
	}
	
	
	//��� ����� ȭ�鿡 ���
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	//���� �޼ҵ尡 ������ ������ �� ����
//	public static void main(String[] args) {
//		for(int i=2; i<10; i++) {
//			int[] result=calculate(i); //���� Ŭ�������� ȣ���ϰ� ����.
//			System.out.println(i+"�� ����");
//			print(result);
//		}
//	}
}
