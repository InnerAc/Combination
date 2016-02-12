package edu.hhu.innerac.combination.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author innerac
 * 排列数工具类
 */
public class Permutation {

	public static String visit(String arg,int index){
		return new StringBuffer(arg).replace(index, index+1, "1").toString();
	}
	
	/**
	 * 输入一个字符串，生成改字符串的全排列。<br>
	 * 使用队列进行维护，空间开销会大一些,但是至少比递归小。
	 * @param str
	 * @return
	 */
	public static List<String> perms(String str){
		List<String> perm = new ArrayList<>();
		int n = str.length();
		Queue<String> queue = new LinkedList<>();
		String vis = new String();
		for(int i=0;i<n;i++){
			vis += '0';
		}
		for(int i=0;i<n;i++){
			queue.add(String.valueOf(str.charAt(i)));
			queue.add(visit(vis, i));
		}
		String array = null;
		while(!queue.isEmpty()){
			array = queue.poll();
			vis = queue.poll();
			if(array.length() == n){
				perm.add(array);
			}else{
				for(int i=0;i<n;i++){
					if(vis.charAt(i) == '1'){
						continue;
					}
					queue.add(array + str.charAt(i));
					queue.add(visit(vis, i));
				}
			}
//			System.out.println(queue);
		}
		return perm;
	}
	
	public static void main(String args[]){
		List<String> pList = perms("abc");
		System.out.println(pList);
	}
}
