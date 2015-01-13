package com.tmax;

public class ThreadTest implements Runnable {
	private CommonVar cv = null;
	private boolean option;
	public ThreadTest(CommonVar cv, boolean option) {
		super();
		this.cv = cv;
		this.option = option;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(cv){//in synchronized block, we should pass the common variable.
			for(int i = 1; i < 101; i++){
				if(option)
				{
					System.out.print(i+" - ");
					cv.increment();
				}else{
					System.out.print(i+" - ");
					cv.decrement();
				}
			}
		}
		/*for(int i = 1; i < 101; i++){
			if(option)
			{
				System.out.print(i+" - ");
				cv.increment();
			}else{
				System.out.print(i+" - ");
				cv.decrement();
			}
		}*/
	}
	
	public static void main(String[] args){
		CommonVar cv = new CommonVar(0);
		ThreadTest tt1 = new ThreadTest(cv,true);
		ThreadTest tt2 = new ThreadTest(cv,false);
		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt2);
		t1.start();
		t2.start();
	}

}


class CommonVar{
	private int Count;

	public CommonVar(int count) {
		super();
		Count = count;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommonVar [Count=" + Count + "]";
	}
	public void increment()
	{
		this.Count ++;
		System.out.println(this.toString());
	}
	public void decrement()
	{
		this.Count --;
		System.out.println(this.toString());
	}
}