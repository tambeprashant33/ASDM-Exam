class LinkList
{
	Node head;		
	static class Node 		
{	
	int data; 		
	Node next;			
	Node(int d)
	{	
	
		data=d;
		next=null;		
	
	}
}	
	void display()
	{
		Node n=head;  
		while(n!=null)			
		{
			System.out.print(n.data+"-->");
			n=n.next;
		}
		
	
	
	}

	public static void main(String args[])
	{
		LinkList l1=new LinkList();		
		l1.head=new Node(11);		
		Node second=new Node(22);			
		Node third=new Node(33);
        Node Four=new Node(44);		
		l1.head.next=second;			
		second.next=third;
        third.next=Four;
		l1.display();
	
	}

}
