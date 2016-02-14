package edu.hhu.innerac.combination.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.hhu.innerac.combination.PermSelect;
import edu.hhu.innerac.combination.extend.AloTtoList;
import edu.hhu.innerac.combination.util.CombinationUtil;

public class PermTest {

	@Test
	public void perm(){
		AloTtoList aloTtoList = new AloTtoList(10, 5);
		List<String> list = aloTtoList.generateList();
		PermSelect permSelect = new PermSelect();
		list = permSelect.FromNselectT(list, 5, 3);
		System.out.println(list);
	}
	
	@Test
	public void test(){
		AloTtoList aloTtoList = new AloTtoList(30, 5);
		List<String> list = aloTtoList.generateList();
		List<Integer> indexs = CombinationUtil.randomN(0, list.size()-1, 10);
		List<String> newList = new ArrayList<>();
		for(int index : indexs){
			newList.add(list.get(index));
		}
		PermSelect permSelect = new PermSelect();
		list = permSelect.FromNselectT(newList, 5, 3);
		System.out.println(list);
	}
}
