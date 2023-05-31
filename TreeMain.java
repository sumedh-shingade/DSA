
class BinarySearchTree
	{
		static class Node
		{
			//Node Fields
			private int data;
			private Node left;
			private Node right;
		
		
		//default constructor
		public Node() 
		{
			data=0;
			left=null;
			right=null;
		}
		
		//parameterised constructor
		public Node(int val) {
			data=val;
			left=null;
			right=null;
		}
	}
		
		//tree fields
		
		private Node root;
		
		//tree methods
		public BinarySearchTree() {
			root=null;
			
		}
		
		public void add(int val) {
			Node newNode=new Node(val);
			if(root==null)
			{
			root=newNode;
			}
			else {
				Node trav=root;
			
				while(true) {
					//check whether value is less than root
					if(val < trav.data) 
					{
						if(trav.left!=null)
						{
							trav=trav.left;
						}
						else {
							trav.left=newNode;
							break;
						}
					}
					else
						//value is greater than root
					{
							if(trav.right!=null)
							{
								trav=trav.right;
							}
							else 
							{
								trav.right=newNode;
								break;
							}
						
					}
				}
		}
			
	}
		public void preorder(Node trav) 
		{
			if(trav==null) {
				return;
			}
				
			else 
			{
		
			System.out.print(trav.data+",");
			preorder(trav.left);
			preorder(trav.right);
			}
			
		}
		
		
		public void preorder() {
			preorder(root);
		}
			
			
			
			
		}
		
	
public class TreeMain {
	public static void main(String[] args){
		BinarySearchTree t=new BinarySearchTree();
		t.add(40);
		t.add(50);
		t.add(20);
		t.add(90);
		t.add(80);
		t.preorder();
		
	}
}
