package pa3;

public class Staircase {
	public static BT<Integer> getTree(int n, int k1, int k2) {
		BT<Integer> bt=new LinkedBT<Integer>();
		while(n>k2) {
		bt.insert(k2,Relative.RightChild); 
		k2=k2+k2;
		}
		bt.find(Relative.Root);
		while(n>k1) {
			bt.insert(k1,Relative.LeftChild); 
         k1=k1+k1;
		}
		bt.find(Relative.Root);
             return bt;
	}

	public static BT<Integer> getTreeWithout(int n, int k1, int k2, int k) {
		BT<Integer> bt=new LinkedBT<Integer>();
		while(n>k2) {
			if(k2!=k) {
		bt.insert(k2,Relative.RightChild); 
		k2=k2+k2;}
			continue;}
		
		bt.find(Relative.Root);
		while(n>k1) {
			if(k1!=k) {
			bt.insert(k1,Relative.LeftChild); 
         k1=k1+k1;
		}
	    continue;
		}
		bt.find(Relative.Root);
             return bt;	}

	public static int getNbSol(int n, int k1, int k2) {
		/*if(n<0)return 0;
		else
			if(n==0) return 1;
			else 
				return getNbSol(n-k1)+getNbSol(n-k2);}*/
		          int j=0;
				BT<Integer> bt=new LinkedBT<Integer>();
				bt=getTree(n,k1,k2);
				bt.find(Relative.Root);
			j= recgetNbSol(bt,j);
		return j;}
	
	private static int recgetNbSol(BT<Integer> bt,int j) {
	if(bt.empty())return 0;
	if(bt.find(Relative.LeftChild)) {
	j=1+recgetNbSol(bt,j) ;
	}
	if(bt.find(Relative.RightChild)) {
		j=1+recgetNbSol(bt,j) ;
	} 
	return j;
	
	} 
	
	

	public static int getNbSolWithout(int n, int k1, int k2, int k) {
		int j=0;
				BT<Integer> bt=new LinkedBT<Integer>();
				bt=getTree(n,k1,k2);
				bt.find(Relative.Root);
			j= recNbSolWithout(bt,j);
		return j;	}
	
	private static int recNbSolWithout(BT<Integer> bt,int j) {
		if(bt.empty())return 0;
		if(bt.find(Relative.LeftChild)) {
		j=1+recgetNbSol(bt,j) ;
		}
		if(bt.find(Relative.RightChild)) {
			j=1+recgetNbSol(bt,j) ;
		} 
		return j;
		
		} 


}
