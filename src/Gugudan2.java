import java.util.Scanner;
public class Gugudan2{
	public static void main(String[] args){
		//scanner�� �ݺ��� Ȱ��
		System.out.println("�� ��? ");
		Scanner gugu=new Scanner(System.in);
		int num=gugu.nextInt();
		
		int i=1;
		while(i<10) {
			System.out.println(num*i);
			i++;
		}
		
		for(int j=1; j<10; j++) {
			System.out.println(num*j);
		}

		gugu.close();
		
		//�迭�� ���� for�� ���
		int[] result=new int[9];
		for(i=0;i<result.length;i++) {
			System.out.println((i+1)+"�� ���");			
			for(int j=1;j<10;j++) {
				result[i]=(i+1)*j;
				System.out.println((i+1)+"*"+j+"="+result[i]);
			}
		}
	}
}