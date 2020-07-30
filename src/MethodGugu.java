
public class MethodGugu {
	//static 언제 사용해야 하지?
	public static int[] calculate(int times) {
		int[] result=new int[9];
		for (int i=0;i<result.length;i++) {
			result[i]=times*(i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		
//		int[] result=calculate(2);
//		for (int i=0;i<result.length;i++) {
//			System.out.println(result[i]);			
//		}
//		int[] times3=calculate(3);
//		for (int i=0;i<result.length;i++) {
//			System.out.println(times3[i]);			
//		}
//		int[] times4=calculate(4);
//		print(times4);

		for (int j=2;j<10;j++) { 
			//MethodGugu gugu=new MethodGugu();
			int[] result=calculate(j); 
			print(result);  
		}
	}
	
}
