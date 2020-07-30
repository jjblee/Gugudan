import java.util.Scanner;
public class Gugudan2{
	public static void main(String[] args){
		//scanner와 반복문 활용
		System.out.println("몇 단? ");
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
		
		//배열과 이중 for문 사용
		int[] result=new int[9];
		for(i=0;i<result.length;i++) {
			System.out.println((i+1)+"단 출력");			
			for(int j=1;j<10;j++) {
				result[i]=(i+1)*j;
				System.out.println((i+1)+"*"+j+"="+result[i]);
			}
		}
	}
}