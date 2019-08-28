package Multithreading_in_Java;

public class PrintEvenOddTester_2 {
	static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {

                for (int itr = 1; itr < 21; itr = itr + 2) {
                    synchronized (lock) {
                        System.out.println("odd  thread: " + itr);
                        try {
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {

                for (int itr = 2; itr < 21; itr = itr + 2) {
                    synchronized (lock) {
                        System.out.println("even thread: " + itr);
                        try {
                            lock.notify();
                            if(itr==20)
                              break;
                            lock.wait();
                            
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        
        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("\nPrinting over");
        } catch (Exception e) {
        	System.out.println(e);
        }
    }
}

/*
 * https://stackoverflow.com/questions/13786083/create-two-threads-one-display-odd-other-even-numbers
 
In order to achieve so, the run methods of the two threads above have to be called one after the other, i.e. they need to be
synchronized and I am achieving that using locks.

The code works like this: t1.run prints the odd number and notifies any waiting thread that it is going to release
the lock, then goes into a wait state.

At this point t2.run is invoked, it prints the next even number, notifies other threads that it is about to release the 
lock it holds and then goes into wait state.

This continues till the itr in t2.run() reaches 50, at this point our goal has been achieved and we need to kill these 
two threads.

By breaking, I avoid calling lock.wait() in t2.run and t2 thread is thus shutdown, the control will now go to t1.run 
since it was waiting to acquire the lock; but here itr value will be > 51 and we will come out of its run(), thus shutting
down the thread.

If break is not used in t2.run(), though we will see numbers 1 to 50 on the screen but the two threads will get into a 
deadlock situation and continue to be in wait state.
*/