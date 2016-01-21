package edu.hhu.innerac.combination.test;


import org.junit.Test;

import edu.hhu.innerac.combination.AloT;
import edu.hhu.innerac.combination.AloTB;
import edu.hhu.innerac.combination.BSearch;

public class ComTest {

	@Test
	public void bsearchTest(){
		BSearch bSearch = new BSearch();
		int[] a = new int[100];
		for(int i=0;i<100;i++){
			a[i] = i*2;
		}
		bSearch.init(a);
		int j;
		for(int i=0;i<200;i++){
			j = bSearch.findIndexOrPre(i);
			System.out.println(i+" "+a[j]);
		}
	}
	
	@Test
	public void aloTest(){
		AloT aloT = new AloT(10, 3);
		aloT.generate();
	}
	
	@Test
	public void aloTBTest(){
		AloTB aloTB = new AloTB(10, 2);
		int[] a = new int[5];
		for(int i=0;i<5;i++){
			a[i] = i*2;
		}
		aloTB.setSet(a);
		aloTB.generate();
	}
	
	/**
	 * 生成两两组合
	 */
	@Test
	public void TwiceCom(){
		AloTB aloTB = new AloTB(10, 2);
		int[] a = new int[] {0,3,8};
		aloTB.setSet(a);
		aloTB.generate();
	}
}
