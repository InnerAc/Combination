package edu.hhu.innerac.combination;

/**
 * @author innerac
 * 计算机程序设计艺术(TAOCP)中组合数中的算法T。<br>
 * 用于求[0,n)之中长度为t的组合数.<br>
 * 例如[0,3)之中长度为2的组合数为:01;02;12
 */
public class AloT {

	protected int maxn;		//组合数的范围[0,maxn)
	protected int numb;		//组合数的长度
	protected int[] c;		//用于保存组合数的数组

	/**
	 * 构造函数。
	 * @param n	组合数的范围
	 * @param t	组合数的长度
	 */
	public AloT(int n, int t) {
		this.maxn = n;
		this.numb = t;
		c = new int[t + 3];
	}

	/**
	 * 访问组合数，一般可以复写用于输出或其他操作<br>
	 * 数组范围为[1,t]
	 */
	public void visit() {
		for(int i=1;i<=numb;i++){
			System.out.print(c[i]);
		}
		System.out.println();
	}

	/**
	 * 生成组合数，如果需要对组合数进行操作请复写visit函数
	 */
	@SuppressWarnings("unused")
	public void generate() {
		int n = maxn;
		int t = numb;
		int cnt = 0;
		int i = 0;
		for (i = 1; i <= t; i++) {
			c[i] = i - 1;
		}
		c[t + 1] = n;
		c[t + 2] = 0;
		int j = t;
		int x = 0;
		while (true) {
T2:
			visit();
			if (j > 0) {
				x = j;
			} else {
				T3: if (c[1] + 1 < c[2]) {
					c[1] = c[1] + 1;
					continue;
				} else {
					j = 2;
					while (true) {
						T4: c[j - 1] = j - 2;
						x = c[j] + 1;
						cnt++;
						if (c[j + 1] == x)
							j = j + 1;
						else
							break;
					}
					if (j > t) {
						break;
					}
				}
			}
			T6: c[j] = x;
			j = j - 1;
		}
	}
}
