package edu.hhu.innerac.combination;

public class AloT {

	protected int maxn;
	protected int numb;
	protected int[] c;

	public AloT(int n, int t) {
		this.maxn = n;
		this.numb = t;
		c = new int[t + 3];
	}

	public void visit() {
		for(int i=1;i<=numb;i++){
			System.out.print(c[i]);
		}
		System.out.println();
	}

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
