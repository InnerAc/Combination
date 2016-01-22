package edu.hhu.innerac.combination.extend;

import edu.hhu.innerac.combination.AloTB;

/**
 * @author innerac
 * 用于生成不同集合之间两两组合的样例。范围从0到n，不包括n。<br>
 * 对于组合数的操作默认为控制台输出，可以复写myFun()函数来改变。
 * 
 */
public class Pairwise extends AloTB {

	public Pairwise(int n) {
		super(n, 2);
	}
	
	@Override
	public void myFun(){
		for(int i=1;i<=numb;i++){
			System.out.print(c[i]);
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		Pairwise pairwise = new Pairwise(10);	//设置生成范围
		int[] a = new int[] {0,3,8};	//设置每一个集合的起点元素
		pairwise.setSet(a);
		pairwise.generate();			//开始生成
	}
}
