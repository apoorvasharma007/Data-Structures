class linkedlist
{
	node head=null;

	public class node 
	{
		int data;
		node next;

		public node(int n)
		{
			data=n;
			next=null;
		}
	}

	public linkedlist insertatend(linkedlist list,int number)
	{
		node new_node=new node(number);
		
		if(list.head==null)
		{	
			list.head=new_node;
			return list;
		}	
		node i=list.head; // i is a iterator node which is being used to iterate over the linked list.
		while(i.next!=null)
		{
			i=i.next;
		}
		i.next=new_node;
		return list;

	}

	public linkedlist insertatstart(linkedlist list, int number)
	{
		node new_node=new node(number);
		if(list.head==null)
		{
			list.head=new_node;
			return list;
		}
		new_node.next=list.head;
		list.head=new_node;
		return list;	
	}

	public linkedlist insertafterkey(linkedlist list, int key, int number)
	{
		node new_node=new node(number);
		node i=list.head;
		while(i!=null)
		{
			if(i.data==key)
				break;
			i=i.next;
		}
		// when loop breaks i will be pointing to the node which has the key.
		if(i!=null)
		{
			new_node.next=i.next;
			i.next=new_node;
			return list;    // if we found the key we'll return the updated linked list else we return the same.
		}
		else
			return list;
	}

	public linkedlist insertbeforekey(linkedlist list, int key, int number)
	{
		node new_node=new node(number);
		node curr=list.head;
		node prev=list.head;

		while(curr!=null)
		{
			if(curr.data==key)
				break;
			prev=curr;
			curr=curr.next;
		}
		if(curr==head)
		{
			new_node.next=head;
			head=new_node;
			return list;

		}
		else if(curr!=null)
		{
			new_node.next=curr;
			prev.next=new_node;
			return list;
		}
		else
			return list;
	}

	public void printlist(linkedlist list)
	{
		if(list.head==null)
			System.out.println("List is empty");
		else
		{
			node i=list.head;
			while(i!=null)
			{
				System.out.print(i.data+" ");
				i=i.next;
			}
			System.out.println("");
		}
	}
	
	public linkedlist deleteatstart(linkedlist list)
	{
		if(list.head==null)
			return list;
		else
		{
			list.head=list.head.next;
			// java automatically frees memory via the garbage collector.
			return list;
		}
	}
	
	public linkedlist deleteatend(linkedlist list)
	{
		if(list.head==null)
			return list;
		else
		{
			node i=list.head;
			node prev=list.head;
			while(i.next!=null)
			{
				prev=i;
				i=i.next;
			}
			prev.next=null;
			return list;
		}
	}

	public linkedlist deletekey(linkedlist list, int key)
	{                         
		if(list.head==null)
			return list;
		node i=list.head;
		node prev=list.head;
		while(i!=null)
		{
			if(i.data==key)
				break;
			prev=i;
			i=i.next;
		}
		if(i==list.head)
			deleteatstart(list); // if first node has to be deleted then we need to update head of list.
		prev.next=i.next;  // if key is in between or at end, then we dont have to update the head of list.
		i.next=null;
		
		return list;
	}
}
	