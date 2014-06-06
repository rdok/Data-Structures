package me.rdokollari.queue;

public class Queue
{
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	/**
	 * constructor
	 * 
	 * @param maxSize
	 */
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	/**
	 * put item at rear of queue. Change the Code to
	 * 
	 * when rear = 0 means there is a single element, so rear is 0. Instead when
	 * there are not elements at all, then rear = -1 represting no element inside
	 * list.
	 * 
	 * @param j
	 */
	public void insert(long j) {
		// check if the queue is full before inserting.
		if (rear == maxSize - 1) {
			rear = -1; // deal with wrap around
		}
		queArray[++rear] = j; // increment rear and insert
		nItems++; // one more item
	}

	/**
	 * take item from front of queue
	 * 
	 * @return
	 */
	public long remove() {
		long temp = queArray[front++]; // get value and incr front
		if (front == maxSize) // deal with wraparound
			front = 0;
		nItems--; // one less item
		return temp;
	}

	public void display() {

		System.out.print("Array: ");
		// Missing Code

		System.out.print("Queue: ");

		// Missing Code

		System.out.println("\n");
	} // end display()
		// --------------------------------------------------------------

	/**
	 * true if queue is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return (nItems == 0);
	}

	/**
	 * true if queue is full
	 * 
	 * @return
	 */
	public boolean isFull() {
		return (nItems == maxSize);
	}

	/**
	 * number of items in queue
	 * 
	 * @return
	 */
	public int getN() {
		return nItems;
	}
} // end class Queue