package learning;

public class Error_Handling {
	public static void main(String[] args) {
		try {
			int[] myNums= {1,2,3,4,5};
			System.out.println(myNums[10]);
		}catch(Exception e) {
			System.out.println("Something went wrong..");
		}
		finally {
			System.out.println("Process is completed........");
		}
	}
}
