public class PartnerMain
{
	public static void main(String[]args)
	{

		//armaan ganeshan


        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        
		addNumbers farees = (s, e) -> {
    
        int sum=0;
        for(int x=s;x<=e;x++)
        {
            sum+=x;
        }
        return sum;
    //hello
		};
        int result = farees.addNumbersMethod(start, end);
		System.out.println("The sum between " + start +" and " + end +" is " + result);

	}
}

