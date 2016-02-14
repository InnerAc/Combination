package edu.hhu.innerac.combination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import edu.hhu.innerac.combination.extend.AloTtoList;

public class PermSelect {
	List<String> indexs = null;
	
	/**
	 * 从长度为n的序列中选出长度为t的序列，选出的序列遵循原有顺序。<br>
	 * 长度为n的序列有多组，选出的t序列有重复，会进行去重。<br>
	 * 序列规范为"1,2,3,4"字符串中的元素用','隔开
	 * @param lists	长度为n的序列的list
	 * @param n		list的一个元素的长度
	 * @param t		选出序列的长度
	 * @return
	 */
	public List<String> FromNselectT(List<String> lists,int n,int t){
		List<String> ans = new ArrayList<>();
		indexs = new AloTtoList(n, t).generateList();
		for(String list : lists){
			String[] liStrings = list.split(",");
			for(String index : indexs){
				String[] ins = index.split(",");
				String an = "";
				an += liStrings[Integer.valueOf(ins[0])];
				int ins_n = ins.length;
				for(int i=1;i<ins_n;i++){
					int xi = Integer.valueOf(ins[i]);
					an += ","+liStrings[xi];
				}
				ans.add(an);
			}
		}
		ans = new ArrayList<>(new HashSet<>(ans));
		return ans;
	}
	public List<String> FromNselectTN(List<Integer> lists,int n,int t){
		List<String> ans = new ArrayList<>();
		indexs = new AloTtoList(n, t).generateList();
		int cnt = lists.size()/n;
		int p = 0;
		while(cnt-- > 0){
			for(String index : indexs){
				String[] ins = index.split(",");
				String an = "";
				an += lists.get(p+Integer.valueOf(ins[0]));
				int ins_n = ins.length;
				for(int i=1;i<ins_n;i++){
					int xi = Integer.valueOf(ins[i]);
					an += ","+lists.get(p+xi);
				}
				ans.add(an);
			}
			p += n;
		}
		ans = new ArrayList<>(new HashSet<>(ans));
		return ans;
	}
	
	
	public static void main(String args[]){
		PermSelect ps = new PermSelect();
		List<String> lists = new ArrayList<>();
		lists.add("1,2,3,4,5");
		lists.add("2,1,3,4,5");
		System.out.println(ps.FromNselectT(lists, 5, 3));
		List<Integer> intList = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			intList.add(i);
		}
		intList.add(2);
		intList.add(1);
		for(int i=3;i<6;i++){
			intList.add(i);
		}
		System.out.println(ps.FromNselectTN(intList, 5, 3));
	}
}
