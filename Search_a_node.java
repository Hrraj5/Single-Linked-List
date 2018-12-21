import java.util.*;

public class Search_a_node {
	Node head;
	class Node{
		 int info;
		 Node next;
		 Node(int data)
		 {
			 info=data;
			 next=null;
		 }
	}
	Search_a_node()
	{
		head=null;
		
	}
	public void insert(int data)
	{
		Node node=new Node(data);
		if(head==null)
			head=node;
		else
		{
			Node ptr=head;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=node;
			
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
	public boolean search_the_node(int data)
	{
		Node ptr=head;
		boolean c=search(ptr,data);
		return c;
	}
	public boolean search(Node node,int data)
	{
		Node ptr=node;
		if(ptr==null)
			return false;
		else if(node.info==data)
			return true;
		 
		ptr=ptr.next;
		return search(ptr,data);
			
	}
	
	public  static void main(String args[])
	{
		Search_a_node ptr=new Search_a_node();
		ptr.insert(21);
		ptr.insert(22);
		ptr.insert(34);
		ptr.insert(45);
		ptr.display();
		boolean c=ptr.search_the_node(4);
		System.out.println(c);
		ptr.insert(4);
		 c=ptr.search_the_node(4);
		System.out.println(c);
		
		
	
		
	}
}
