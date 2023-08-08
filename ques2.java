package Aug8Test;
import java.util.*;
class stringCheck {
	int countCheck(String order, List<String> list) {
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			char []orderTemp = order.toCharArray();
			Arrays.sort(orderTemp);
			char [] listTemp=list.get(i).toCharArray();
			Arrays.sort(listTemp);
			String orderTempString=new String(orderTemp);
			String listTempString = new String(listTemp);
			if(orderTempString.equals(listTempString))
			{count=count+1;}
		}
		return count;
	}
}
public class ques2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		List<String> list=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			String temp=sc.next();
			list.add(temp);
		}
		String order=sc.next();
		stringCheck count=new stringCheck(); 
		System.out.println(count.countCheck(order, list));
		
		// TODO Auto-generated method stub

	}

}
