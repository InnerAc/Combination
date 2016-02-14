package edu.hhu.innerac.combination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import edu.hhu.innerac.combination.extend.AloTtoList;

public class PermSelect {
	List<String> indexs = null;
	
	/**
	 * 从长度为n的序列中选出长度为t的序列，选出的序列遵循原有顺序。<br>
	 * 长度为n的序列有多组，选出的t序列有重复，会进行去重。
	 * @param lists	长度为n的序列的list
	 * @param n		list的一个元素的长度
	 * @param t		选出序列的长度
	 * @return
	 */
	public List<String> FromNselectT(List<String> lists,int n,int t){
		List<String> ans = new ArrayList<>();
		indexs = new AloTtoList(n, t).generateList();
		for(String list : lists){
			for(String index : indexs){
				String an = "";
				for(char c : index.toCharArray()){
					int i = c-'0';
					an += list.charAt(i);
				}
				ans.add(an);
			}
		}
		ans = new ArrayList<>(new HashSet<>(ans));
		return ans;
	}
	
	public static void main(String args[]){
		PermSelect ps = new PermSelect();
		List<String> lists = new ArrayList<>();
		lists.add("12345");
		lists.add("21345");
		System.out.println(ps.FromNselectT(lists, 5, 3));
	}
}
