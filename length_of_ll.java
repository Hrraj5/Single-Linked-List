import java.util.*;

public class length_of_ll {
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
	length_of_ll()
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
	public void length_of_linkedlist()
	{
		System.out.println(count);
	}
	public static void main(String args[])
	{
		length_of_ll ptr=new length_of_ll();
		ptr.insert(21);
		ptr.insert(22);
		ptr.insert(23);
		ptr.insert(24);
		ptr.insert(25);
		ptr.display();
		System.out.println("the length of linked list is");
		ptr.length_of_linkedlist();
		ptr.insert(26);
		ptr.display();
		System.out.println("the length of linked list is");
		ptr.length_of_linkedlist();
	}
}
