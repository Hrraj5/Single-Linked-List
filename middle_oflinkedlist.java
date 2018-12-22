import java.util.*;
public class middle_oflinkedlist {
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
	middle_oflinkedlist()
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
	public int middle()
	{
		Node ptr=head;
		int n=count/2;
		if(n%2!=0)
		{
			int i;
			for(i=0;i<n;i++)
			{
				ptr=ptr.next;
			}
			return ptr.info;
		}
		else
		{
			int i;
			for(i=0;i<n;i++)
			{
				ptr=ptr.next;
			}
			return ptr.info;
		}
		
	}
	public static void  main(String args[])
	{
		middle_oflinkedlist ptr=new middle_oflinkedlist();
		ptr.insert(21);
		ptr.insert(22);
		ptr.insert(23);
		ptr.insert(24);
		ptr.insert(25);
		ptr.insert(26);
		ptr.display();
		int data=ptr.middle();
		System.out.println("The middle element node is ");
		System.out.println(data);
	}
}
