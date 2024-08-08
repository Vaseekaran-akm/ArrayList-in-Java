package ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
public class DemoLinkedSet 
{
	public static void main(String[] args) 
	{
		Set<Integer> s= new HashSet<Integer>();
		s.add(29);
		s.add(45);
		s.add(null);
		s.add(null);
		s.add(67);
		s.add(67);
		s.add(52);
		s.add(78);
		s.add(90);
		System.out.println(s);
		System.out.println(s.remove(67));
		System.out.println(s);
		Iterator<Integer> l=s.iterator();
		while(l.hasNext())
			System.out.print(l.next()+" ");
	}
}
