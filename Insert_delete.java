import java.util.*;

public class Insert_delete {
	
	Node head;
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
	Insert_delete()
	{
		head=null;
	}
	// to append a node
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
	//To display the whole node
	public void display()
	{
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.println(ptr.info);
			ptr=ptr.next;
		}
	}
	//insert node at first position
	public void insert_st_first(int data)
	{
		Node node=new Node(data);
		if(head==null)
			System.out.println("Linked list emptyt");
		else
		{
			  node.next=head;
			  head=node;
		}
			
	}
	// to delete at first position
	public void del_at_first()
	{
		Node ptr=head;
		head=head.next;
		
	}
	public void del_at_last()
	{
		Node ptr=head;
		Node prev=head;
		while(ptr.next!=null)
		{
			prev=ptr;
			ptr=ptr.next;
		}
		prev.next=null;
	}
	// to insert at any position
	public void insert_at_any_position()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the data");
		int data=sc.nextInt();
		Node node=new Node(data);
		Node ptr=head;
		
		System.out.println("enter the position");
		int n=sc.nextInt();
		int i;
		if(n==1)
		{
			
			node.next=head;
			head=node;
		}
		else
		{
			for(i=1;i<n-1;i++)
			{
				ptr=ptr.next;
			}
			node.next=ptr.next;
			ptr.next=node;
		}
			
			
	}
	public static void main(String args[])
	{
		Insert_delete ptr=new Insert_delete();
		ptr.insert(21);//first node 
		ptr.insert(22);//to append
		ptr.insert(23);//to append
		ptr.insert_st_first(25);//to insert at first position
		ptr.del_at_first();// to delete at first position
		ptr.insert(29);// to append
		ptr.del_at_last();
		//ptr.insert_at_any_position();// to insert at any position
		ptr.display();// to display
		
	}
}
