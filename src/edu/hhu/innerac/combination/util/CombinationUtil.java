package edu.hhu.innerac.combination.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CombinationUtil {

	/**
	 * 求排列数<br>
	 * 从n个数中取t个数，然后按照顺序排成一列。<br>
	 * @param n	总数
	 * @param t 待排列的数
	 * @return	得到的排列数
	 */
	public static int A(int n, int t){
		if (t > n){
			return -1;
		}
		int ans = 1;
		for(int i=0;i<t;i++){
			ans *= (n--);
		}
		return ans;
	}
	/**
	 * 求阶乘<br>
	 * @param n
	 * @return
	 */
	public static int factorial(int n){
		int ans = 1;
		for(int i=2;i<=n;i++){
			ans *= i;
		}
		return ans;
	}
	/**
	 * 求组合数<br>
	 * 从n个数中，任取t个数组成一组。<br>
	 * @param n
	 * @param t
	 * @return
	 */
	public static int C(int n, int t){
		int c = n - t;
		t = t<c?t:c;
		return A(n,t)/factorial(t);
		
	}
	
	/**
	 * 从范围[st,en]中取m个不重复的随机数<br>
	 * @param st	范围左边界（包括）
	 * @param en	范围右边界（包括）
	 * @param m		选取个数
	 * @return
	 */
	public static List<Integer> randomN(int st, int en, int m){
		Set<Integer> sran = new HashSet<>();
		Random random = new Random();
		while(sran.size() < m){
			sran.add(random.nextInt(en -st) + st);
		}
		return new ArrayList<>(sran);
	}
	public static void main(String args[]){
//		System.out.println(C(3, 3));
		System.out.println(randomN(10, 20, 5));
	}
}
