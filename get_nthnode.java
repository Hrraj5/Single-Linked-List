import java.util.*;
public class get_nthnode {
	Node head;
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
	get_nthnode()
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
	public int nth_node(int index)
	{
		int i;
		Node ptr=head;
		if((index+1)>count)
			return 0;
		
		else
		{
		for(i=0;i<index;i++)
		{
			ptr=ptr.next;
			
		}
		return ptr.info;
	}
	}
	
	public static void main(String args[])
	{


		get_nthnode ptr=new get_nthnode();
		ptr.insert(21);
		ptr.insert(22);
		ptr.insert(25);
		ptr.insert(58);
		ptr.display();
		int element=ptr.nth_node(0);// index starts from 0, so give input according to that
		System.out.println(element);
	}
}
