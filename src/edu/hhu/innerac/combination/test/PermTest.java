package edu.hhu.innerac.combination.test;

import java.util.List;

import org.junit.Test;

import edu.hhu.innerac.combination.PermSelect;
import edu.hhu.innerac.combination.extend.AloTtoList;

public class PermTest {

	@Test
	public void perm(){
		AloTtoList aloTtoList = new AloTtoList(10, 5);
		List<String> list = aloTtoList.generateList();
		PermSelect permSelect = new PermSelect();
		list = permSelect.FromNselectT(list, 5, 3);
		System.out.println(list);
	}
}
