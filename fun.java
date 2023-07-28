// Java program to demonstrate
// anonymous method
import java.util.Arrays;
import java.util.List;
public class fun {
	public static void main(String[] args)
	{

		// Defining an anonymous method
		Runnable r = new Runnable() {
			public void run()
			{
				System.out.println(
					"Running in Runnable thread");
			}
		};

		r.run();
		System.out.println(
			"Running in main thread");
	}
}

