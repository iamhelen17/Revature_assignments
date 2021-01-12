package synch_eg;

public class Printer {

	public synchronized static void printPages(Pages page) {
		System.out.print(page.getPage1());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("  "+page.getPage2());
	}
}

//TASK1) Recreate the same and get good understanding of the thread flow using Runnable and Thread class.
//TASK2) Explore on inter-thread communication methods like wait(), notify() , notifyAll()
/*1) wait() method
Causes current thread to release the lock and wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.
2) notify() method
Wakes up a single thread that is waiting on this object's monitor. If any threads are waiting on this object, one of them is chosen to be awakened. The choice is arbitrary and occurs at the discretion of the implementation.

3) notifyAll() method
Wakes up all threads that are waiting on this object's monitor

TASK3) Go over Producer-Consumer problem and how they solve it using inter-thread communication.

The Producer-Consumer problem (also known as the bounded-buffer problem) is a classic example of a multi-process synchronization problem. 
The problem describes two processes, the producer and the consumer, who share a common, fixed-size buffer used as a queue. 
The producer’s job is to generate a piece of data, put it into the buffer and start again.
At the same time, the consumer is consuming the data (i.e., removing it from the buffer) one piece at a time. 

PROBLEM
The problem is to make sure that the producer won’t try to add data into the buffer if it’s full and that the consumer won’t try to remove data from an empty buffer.
In this problem, we need two threads, Thread t1 (produces the data) and Thread t2 (consumes the data). However, both the threads shouldn’t run simultaneously.

SOLUTION 
The producer is to either go to sleep or discard data if the buffer is full. 
The next time the consumer removes an item from the buffer, it notifies the producer, who starts to fill the buffer again. 
In the same way, the consumer can go to sleep if it finds the buffer to be empty. 
The next time the producer puts data into the buffer, it wakes up the sleeping consumer.
Add the keyword synchronized  to put a lock on the data  while you are using it.
*/