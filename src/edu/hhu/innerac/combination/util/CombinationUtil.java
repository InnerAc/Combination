package edu.hhu.innerac.combination.util;

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
	public static void main(String args[]){
		System.out.println(C(3, 3));
	}
}
