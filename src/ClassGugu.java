
public class ClassGugu {
	//���� �޼ҵ带 ������ Ŭ������ �и�
	//�޼ҵ� Ȱ���� ������ ����
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			int[] result=MethodGugu2.calculate(i); //�ٸ� Ŭ�������� ȣ���ϰ� �����Ƿ� Ŭ���� ���� ���
			System.out.println(i+"�� ����");
			MethodGugu2.print(result);
		}
	}
}
