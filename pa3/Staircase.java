public class Staircase {
	public static BT<Integer> getTree(int n, int k1, int k2) {
		BT<Integer> bt=new LinkedBT<Integer>();
		int po=k2;
		int j=k1;
	//	if(n<k1 || n<k2) return null ;
		while(n>po) {
		bt.insert(po,Relative.RightChild); 
		po=po+po;
		}
		bt.find(Relative.Root);
		bt.find(Relative.RightChild); 
		while(n>j) {
			bt.insert(j,Relative.LeftChild); 
             j=j+j;
		      }
		bt.find(Relative.Root);
		int po2=k2;
		int pou=k1;
		while(n>pou) {
			bt.insert(pou,Relative.LeftChild); 
			pou=pou+pou;
		}
		bt.find(Relative.Root);
		bt.find(Relative.LeftChild); 
		while(n>po2) {
			bt.insert(po2,Relative.RightChild); 
			po2=po2+po2;
			}
		bt.find(Relative.Root);
             return bt;
	}

	public static BT<Integer> getTreeWithout(int n, int k1, int k2, int k) {
		BT<Integer> bt=new LinkedBT<Integer>();
		int po=k2;
		int j=k1;
	//	if(n<k1 || n<k2) return null ;
		while(n>po) {
			if(po!=k) {
		bt.insert(po,Relative.RightChild); 
		po=po+po;}
		}
		bt.find(Relative.Root);
		bt.find(Relative.RightChild); 
		while(n>j) {
			if(j!=k) {

			bt.insert(j,Relative.LeftChild); 
             j=j+j;}
		      }
		bt.find(Relative.Root);
		int po2=k2;
		int pou=k1;
		while(n>pou) {
			if(pou!=k) {

			bt.insert(pou,Relative.LeftChild); 
			pou=pou+pou;}
		}
		bt.find(Relative.Root);
		bt.find(Relative.LeftChild); 
		while(n>po2) {
			if(po2!=n) {
			bt.insert(po2,Relative.RightChild); 
			po2=po2+po2;}
			}
		bt.find(Relative.Root);
             return bt;}
	
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
