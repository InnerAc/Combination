package edu.hhu.innerac.combination;

/**
 * @author innerac
 * 用于一种情景<br>
 * 几个连续的数值属于同一集合，需求组合数的元素分别属于不同的结合<br>
 * 例如:<br>
 * 集合A:{0,1,2}<br>
 * 集合B:{3,4}<br>
 * 集合C:{5}<br>
 * 求长度为3的组合数结果为:<br>
 * 035;045;135;145;235;245<br>
 * 对于上一个例子，输入为：<br>
 * n = 6,t = 3,arg = [0,3,5]<br>
 * 输入数组为每个集合的首元素.
 */
public class AloTB extends AloT {

	BSearch bSearch = null;
	
	public AloTB(int n, int t) {
		super(n, t);
	}
	
	/**
	 * 设置过滤数组，即每个集合的首元素组成的数组。
	 * @param arg	过滤数组
	 */
	public void setSet(int[] arg){
		bSearch = new BSearch(arg);
	}
	
	public void myFun(){
		for(int i=1;i<=numb;i++){
			System.out.print(c[i]);
		}
		System.out.println();
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
		myFun();
	}

}
