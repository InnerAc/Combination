package edu.hhu.innerac.combination.util;

public class CombinationUtil {

	static int cnt = 0;
	public static int A(int n, int t){
		if (t > n){
			return -1;
		}
		int ans = 1;
		for(int i=0;i<t;i++){
			ans *= (n--);
			cnt++;
		}
		return ans;
	}
	public static int factorial(int n){
		int ans = 1;
		for(int i=2;i<=n;i++){
			ans *= i;
			cnt++;
		}
		return ans;
	}
	public static int C(int n, int t){
		int c = n - t;
		t = t<c?t:c;
		return A(n,t)/factorial(t);
		
	}
	public static void main(String args[]){
		System.out.println(C(10, 8));
		System.out.println(cnt);
	}
}
