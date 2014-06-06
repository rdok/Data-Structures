package me.rdokollari.queue;

public class QueueTester
{

	public static void main(String[] args) {
		Queue theQueue = new Queue(5); // queue holds 5 items
		theQueue.insert(10); // insert 4 items
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		theQueue.remove(); // remove 3 items
		theQueue.remove(); // (10, 20, 30)
		theQueue.remove();
		theQueue.insert(50); // insert 4 more items
		theQueue.insert(60);
		theQueue.insert(70);
		theQueue.insert(80);

		theQueue.display(); // this is the method you will create... (NOW DOES
		// NOT DISPLAY ANYTHING)

		System.out.println("Removing all items...");
		while (!theQueue.isEmpty()) // remove and display
		{ // all items
			long n = theQueue.remove(); // The remove method returns the item
			// that was removed... and we display
			// it...
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("\nDone! ");
	} // end main()
} // end class QueueTester