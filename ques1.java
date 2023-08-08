package Aug8Test;
import java.util.*;

interface AdvancedArithmetic {
	int divisor_sum(int n);
	}

class MyCalculator implements AdvancedArithmetic {
	@Override
	public int divisor_sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				sum=sum+i;}
	// TODO Auto-generated method stub
		return sum;
		}
	}

public class ques1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		MyCalculator mm=new MyCalculator();
		System.out.println(mm.divisor_sum(n));
		// TODO Auto-generated method stub

	}
}