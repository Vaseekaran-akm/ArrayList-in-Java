package ArrayList;
import java.util.Iterator;
import java.util.Stack;
public class DemoStack 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(90);
		s.push(50);
		s.push(56);
		s.push(11);
		s.push(89);
		s.push(56);
		s.push(21);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
		Iterator<Integer> i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next()+" ");
	}

}
