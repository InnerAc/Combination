package edu.hhu.innerac.combination;

public class AloTB extends AloT {

	BSearch bSearch = null;
	
	public AloTB(int n, int t) {
		super(n, t);
	}
	
	public void setSet(int[] arg){
		bSearch = new BSearch(arg);
	}
	
	@Override
	public void visit(){
		int pre = bSearch.findIndexOrPre(c[1]);
		int next;
		for(int i=2;i<=numb;i++){
			next = bSearch.findIndexOrPre(c[i]);
			if(pre == next){
				return;
			}
			pre = next;
		}
		for(int i=1;i<=numb;i++){
			System.out.print(c[i]);
		}
		System.out.println();
	}

}
