package Tree;

public class Tree_Example {

	Dnode root;
	
	void createTree()
	{
		root = null;
	}
	void insertData(Dnode r , Dnode n)
	{
		if(root == null)
		{
			root = n;
		}
		else
		{
			if(n.data < r.data) //left
			{
				if(r.left==null)//check r ka left null hai kya
				{
					r.left=n;
				}
				else
				{
					insertData(r.left,n);
				}
			}
			else
			{
				if(r.right==null)//check r ka right null hai kya
					{
						r.right=n;
					}
					else
					{
						insertData(r.right,n);
					}
			}
		}
	}
	
	void inorder(Dnode r)
	{
		if(r!=null)
		{
			inorder(r.left);
			System.out.println(r.data+" ");
			inorder(r.right);
			
		}
	}
	void postorder(Dnode r )
	{
		if(r!=null)
		{
			postorder(r.left);
			postorder(r.right);
			System.out.println(r.data+" ");
		}
		
	}
	
	void preorder(Dnode r)
	{
		if(r!=null)
		{
			System.out.println(r.data+" ");
			preorder(r.left);
			preorder(r.right);
		}
		
	}
	int getHeight(Dnode r)
	{
		if(r==null)
		{
			return 0; //height hai to 1 nhi hoga
		}
		else
		{
			int leftHeight = getHeight(r.left);  //check  height
			int rightHeight = getHeight(r.left); //check height
			return (Math.max(leftHeight, rightHeight)+1); //find max height + 1
            
		}
		
	}
	boolean isBalance(Dnode r)
	{
		if(r==null)
		{
			return true; //height hai to 1 nhi hoga
		}
		else
		{
			int leftHeight = getHeight(r.left);  //check  height
			int rightHeight = getHeight(r.left); //check height
			if(Math.abs(leftHeight - rightHeight)<=1)
				return false;
			
			return (isBalance(r.left) && isBalance(r.right));
            
		}
	
	}
	public static void main(String [] args)
	{
		Tree_Example t = new Tree_Example();
		Dnode n1 = new Dnode(100);
		t.insertData(t.root ,n1 );
		Dnode n2 = new Dnode(50);
		t.insertData(t.root ,n2 );
		Dnode n3 = new Dnode(20);
		t.insertData(t.root ,n3 );
		Dnode n4 = new Dnode(120);
		t.insertData(t.root ,n4 );
		Dnode n5 = new Dnode(130);
		t.insertData(t.root ,n5 );
		Dnode n6 = new Dnode(10);
		t.insertData(t.root ,n6 );
		Dnode n7 = new Dnode(70);
		t.insertData(t.root ,n7 );
		System.out.println("Inorder");
		t.inorder(t.root);
		System.out.println("Preorder");
		t.preorder(t.root);
		System.out.println("Postorder");
		t.postorder(t.root);
		System.out.println("Height is :"+(t.getHeight(t.root)-1));
		System.out.println("IsBalanced :"+t.isBalance(t.root));
	}
}
