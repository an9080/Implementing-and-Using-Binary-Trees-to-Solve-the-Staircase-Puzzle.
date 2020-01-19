public class BTUtils {
	public static <T> int nbLeaf(BT<T> bt, T e) {
		int i=0;
		if(!bt.empty()) {
			if(bt.retrieve()==e) {
				i= nbLeafrcs(bt,i);
			return i;}
			
			else {	
			if(bt.find(Relative.LeftChild))
			nbLeaf(bt,e) ;
			if(bt.find(Relative.RightChild))
			nbLeaf(bt,e) ;}		
		}
		return 0;

	}

	private  static <T> int nbLeafrcs(BT<T> bt, int k) {
		//boolean found=true;
		if(bt.find(Relative.LeftChild)) {
			//found=false;
			nbLeafrcs(bt,k);
			bt.find(Relative.Parent);
		}
		
		if(bt.find(Relative.RightChild)) {
			//found=false;
			nbLeafrcs(bt,k);
			bt.find(Relative.Parent);
		}
	 if(bt.isLeaf()) {  
         k++;}
	return k;
	 
	/* if(bt.find(Relative.LeftChild)&& bt.isLeaf())
	 {found++;	}
	 else
		 nbLeafrcs(bt,e,found);
		 if(bt.find(Relative.RightChild)&& bt.isLeaf())
		 {found= nbLeafrcs(bt,e,found);	}
	return found;*/
	 
		 
	}

 
	public static <T> void pruneBranch(BT<T> bt, T e) {
if(bt.empty())return;
bt.find(Relative.Root);
foundpruneBranch(bt,e);
		bt.deleteSub();
	}
	private static <T> void foundpruneBranch(BT<T> bt, T e) {
		if(bt.empty())return;
		if(bt.retrieve().equals(e))return;
		else
		if(bt.find(Relative.LeftChild))	
		foundpruneBranch(bt,e);
		else
			if(bt.find(Relative.RightChild))
				foundpruneBranch(bt,e);	
	}
}