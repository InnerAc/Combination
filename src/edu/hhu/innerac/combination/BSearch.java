package edu.hhu.innerac.combination;

public class BSearch {
	private int[] array;
	private int array_n;
	public BSearch(){
	}
	public BSearch(int[] arg){
		init(arg);
	}
	public BSearch(int[] arg,int n){
		init(arg, n);
	}
	public void init(int[] arg){
		init(arg,arg.length);
	}
	public void init(int[] arg,int n){
		this.array = arg.clone();
		this.array_n = n;
	}
	
	public int findIndex(int info){
		int ans = -1;
		int st = 0;
		int en = array_n;
		int mid = (st+en)/2;
		while(true){
			mid = (st+en)/2;
			if(array[mid] < info){
				st = mid+1;
				continue;
			}
			if(array[mid] > info){
				en = mid;
				continue;
			}
			if(array[mid] == info){
				ans = mid;
				break;
			}
		}
		return ans;
	}
	
	public int findIndexOrPre(int info){
		int ans = -1;
		int st = 0;
		int en = array_n;
		int mid = (st+en)/2;
		while(st<en){
			mid = (st+en)/2;
			if(array[mid] < info){
				st = mid+1;
				continue;
			}
			if(array[mid] > info){
				en = mid;
				continue;
			}
			if(array[mid] == info){
				ans = mid;
				break;
			}
		}
		if(ans == -1){
			ans = st-1;
		}
		return ans;
	}
	
	public int findIndexOrNext(int info){
		int ans = -1;
		int st = 0;
		int en = array_n;
		int mid = (st+en)/2;
		while(st<en){
			mid = (st+en)/2;
			if(array[mid] < info){
				st = mid+1;
				continue;
			}
			if(array[mid] > info){
				en = mid;
				continue;
			}
			if(array[mid] == info){
				ans = mid;
				break;
			}
		}
		if(ans == -1){
			ans = st;
		}
		return ans;		
	}
}
