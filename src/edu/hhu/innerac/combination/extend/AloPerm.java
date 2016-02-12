package edu.hhu.innerac.combination.extend;

import java.util.List;

import edu.hhu.innerac.combination.AloT;
import edu.hhu.innerac.combination.util.Permutation;

/**
 * @author innerac
 * 生成组合数，用于求得[0,n)中，长度为t的排列数。<br>
 * 例如，[0,3)中，长度为2的排列数为:01;10;02;20;12;21<br>
 * 如果要对生成的排列数进行操作请复写myFun(String)函数。
 */
public class AloPerm extends AloT{

	public AloPerm(int n, int t) {
		super(n, t);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void visit(){
		String str = "";
		for(int i=1;i<=numb;i++){
			str += c[i];
		}
		List<String> perms = Permutation.perms(str);
		for(String perm : perms){
			myFun(perm);
		}
	}
	
	public void myFun(String perm){
		System.out.println(perm);
	}
	public static void main(String args[]){
		AloPerm aloPerm = new AloPerm(5, 3);
		aloPerm.generate();
	}

}
