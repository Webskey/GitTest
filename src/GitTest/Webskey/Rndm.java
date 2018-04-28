package GitTest.Webskey;

public class Rndm {
	public static void main(String args[]) {
		
		double upperbound = 1.2;
		double lowerbound = 4.4;

		for(int i=0;i<10;i++) {
			double f = (double)(Math.random() * (upperbound - lowerbound) + lowerbound);
			System.out.println(f);
		}
		
	}
}