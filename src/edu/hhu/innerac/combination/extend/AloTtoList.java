package edu.hhu.innerac.combination.extend;

import java.util.ArrayList;
import java.util.List;

import edu.hhu.innerac.combination.AloT;

public class AloTtoList extends AloT{

	List<String> ans = new ArrayList<>();
	public AloTtoList(int n, int t) {
		super(n, t);
	}
	
	@Override
	public void visit(){
		String str = "";
		for(int i=1;i<numb;i++){
			str += c[i]+",";
		}
		str += c[numb];
		ans.add(str);
	}
	
	public List<String> generateList(){
		generate();
		return ans;
	}
	
	public static void main(String args[]){
		AloTtoList aloTtoList = new AloTtoList(5, 3);
		List<String> strs = aloTtoList.generateList();
		for(String str : strs){
			System.out.println("-- "+str);
		}
	}
}
