import java.util.Scanner;
public class FinalMission2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("���� �� �� �Է�:");
		String inputValue=scanner.nextLine();
		
		//�Է°��� ��ǥ �������� �и�
		String[] splitedValue=inputValue.split(",");
		//�и��� ���ڿ��� ���ڷ� ��ȯ
		int first=Integer.parseInt(splitedValue[0]);
		int second=Integer.parseInt(splitedValue[1]);
				
		for(int i=2; i<=first; i++) {
			System.out.println(i+"�� ����");
			for(int j=1; j<=second; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
