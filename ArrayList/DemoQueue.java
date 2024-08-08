package ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Iterator;
public class DemoQueue 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);	
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		Iterator<Integer> i=q.iterator();
		while(i.hasNext())
			System.out.println(i.next()+" ");
	}
}
