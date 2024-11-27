public class PartnerMain
{
	public static void main(String[]args)
	{

        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        
		addNumbers farees = (s, e) -> {
    
        int sum=0;
        for(int x=s;x<=e;x++)
        {
            sum+=x;
        }
        return sum;
    
		};
        int result = farees.addNumbersMethod(start, end);
		System.out.println("The sum between " + start +" and " + end +" is " + result);
	}
}

