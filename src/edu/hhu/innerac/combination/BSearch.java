package edu.hhu.innerac.combination;

/**
 * @author innerac
 * 二分检索函数类，安装升序序输入一组整数，通过二分的方法查找其中某一数值的下标。
 */
public class BSearch {
	private int[] array;	//已经排序完成的数组
	private int array_n;	//数组长度
	public BSearch(){
	}
	
	/**
	 * 构造函数，传入一组排序完成的数组.<br>
	 * 注意排序之后将作用于整个数组，即使最后面的下标没有被赋值。<br>
	 * @param arg	待检索的数组
	 */
	public BSearch(int[] arg){
		init(arg);
	}
	/**
	 * 构造函数，传入一组排序完成的数组和长度，检索长度为[0,n)。
	 * @param arg	待检索的数组
	 * @param n		待检索的长度
	 */
	public BSearch(int[] arg,int n){
		init(arg, n);
	}
	/**
	 * 参考构造函数<br>
	 * @param arg
	 */
	public void init(int[] arg){
		init(arg,arg.length);
	}
	/**
	 * 参考构造函数<br>
	 * @param arg
	 * @param n
	 */
	public void init(int[] arg,int n){
		this.array = arg.clone();
		this.array_n = n;
	}
	
	/**
	 * 通过二分方法查找下标。如果没有该值，则返回-1<br>
	 * @param info	待查找的数值
	 * @return		该数值在数组中的下标，若不存在则为-1
	 */
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
	
	/**
	 * 通过二分的方法查找该数值在数组中的下标，<br>
	 * 如果不存在则返回小于该值的最大的数的下标。
	 * @param info	待查找的数
	 * @return		该数值的下标或者他的上界的下标
	 */
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
	/**
	 * 通过二分的方法查找该数值在数组中的下标，<br>
	 * 如果不存在则返回大于该值的最小的数的下标。
	 * @param info	待查找的数
	 * @return		该数值的下标或者他的下界的下标
	 */
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
