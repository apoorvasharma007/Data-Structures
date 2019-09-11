class linkedlistuse{
	public static void main(String[] args)
	{
	linkedlist l1=new linkedlist();
	l1.insertatend(l1,55);
	l1.insertatend(l1,88);
	l1.insertatend(l1,23);
	l1.insertatend(l1,44);
	l1.printlist(l1);
	l1.insertatstart(l1,3);
	l1.printlist(l1);
	l1.insertafterkey(l1,23,76);
	l1.printlist(l1);
	l1.insertbeforekey(l1,88,63);
	l1.printlist(l1);
	l1.insertafterkey(l1,44,19);
	l1.printlist(l1);
	l1.insertbeforekey(l1,3,97);
	l1.printlist(l1);
	l1.deleteatend(l1);
	l1.printlist(l1);
	l1.deleteatstart(l1);
	l1.printlist(l1);
	l1.deletekey(l1,88);
	l1.printlist(l1);
	l1.deletekey(l1,44);
	l1.printlist(l1);
	l1.deletekey(l1,3);
	l1.printlist(l1);	
	}
}