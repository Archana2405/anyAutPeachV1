package GitHubDemo;

public class DemoHello {

	public static void main(String[] args) {
		String[] names={"Bob", "Sam","Mary","Singh"};
		
		//printing 
		for(int i=0;i<names.length;i++)
		{
			System.out.format("Hello,\n",names[i]);
			System.out.println("How are you?");
		}

	}

}
