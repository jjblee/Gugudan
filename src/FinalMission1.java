import java.util.Scanner;
public class FinalMission1 {
	public static void main(String[] args) {
		//����ڷκ��� �� �Է¹ޱ�
		Scanner scanner=new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int times=scanner.nextInt();
		
		//������ ����
		for(int i=2; i<(times+1); i++) {
			System.out.println();
			System.out.println(i+"�� ���");
			for(int j=1; j<(times+1); j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
	}
}
