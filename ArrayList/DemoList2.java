package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class DemoList2 
{
	public static void main(String[] args) 
	{
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(11);
		ls.add(12);
		ls.add(13);
		ls.add(14);
		ls.add(15);
		ls.add(16);
		ls.add(17);
		ls.add(18);
		ls.add(19);
		Iterator<Integer> i=ls.iterator();
		List<Integer> oddList=new ArrayList<Integer>();
		List<Integer> evenList=new ArrayList<Integer>();
		while(i.hasNext())
		{
			int element=i.next();
			System.out.println(i.next());
			if(element%2==0) evenList.add(element);
			else oddList.add(element);
		}
		System.out.print(ls);
		System.out.print(oddList);
		System.out.print(evenList);
	}
}
