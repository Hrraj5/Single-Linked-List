import java.util.*;
public class Search_fromend {
	int count=0;
	class Node
	{
		int info;
		Node next;
		Node(int data)
		{
			info=data;
			next=null;
		}
		
		
	}
	Node head;
	Search_fromend()
	{
		head=null;
	}
	public void insert(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
			count++;
		}
		else
		{
			Node ptr=head;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=node;
			count++;
		}
	}
	public void display()
	{
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.println(ptr.info);
			ptr=ptr.next;
		}
	}
	public int nthfromend(int n)
	{
		Node ptr=head;
		
		if(n>=count || n==0)
		{
			return 0;
		}
		else
		{
			int d=count-n;
			int i;
			for(i=0;i<d;i++)
			{
				ptr=ptr.next;
			}
			return (ptr.info);
			
		}
	}
	
	public static void main(String args[])
	{
		Search_fromend ptr=new Search_fromend();
		ptr.insert(21);
		ptr.insert(22);
		ptr.insert(23);
		ptr.insert(24);
		ptr.display();
		//.out.println(count);
		int n=ptr.nthfromend(1);// n can't be 0.
		System.out.println(n);
	}
}
