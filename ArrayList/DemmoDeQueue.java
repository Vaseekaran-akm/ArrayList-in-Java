package ArrayList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class DemmoDeQueue 
{
	public static void main(String[] args) 
	{
		Deque<Integer> dq=new ArrayDeque<Integer>();
		dq.add(10);
		dq.addFirst(20);
		dq.addLast(30);
		dq.addFirst(40);
		dq.addLast(10);
		dq.addFirst(60);
		dq.addLast(70);
		System.out.println(dq);
		System.out.println(dq.peek());
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq.poll());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq);
		Iterator<Integer> l = dq.iterator();
		while(l.hasNext())
			System.out.print(l.next()+" ");
	}
}
