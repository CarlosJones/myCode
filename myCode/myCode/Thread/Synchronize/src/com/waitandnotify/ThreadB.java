package com.waitandnotify;

/**
* 计算1+2+3 ... +100的和
*/
public class ThreadB extends Thread{
	int total;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 101; i++) {
                total += i;
            }
            try {
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("ThreadB:total="+total);
            //（完成计算了）唤醒在此对象监视器上等待的单个线程，在本例中线程A被唤醒
//            notify();
            notifyAll();
        }
    } 
}
