public class PartnerMain
{
	public static void main(String[]args)
	{
		addNumbers farees = (start, end) -> {
    
        int sum=0;
        for(int x=start;x<=end;x++)
        {
            sum+=x;
        }
        return sum;
    
		};

		System.out.println(farees.addNumbersMethod(1, 3));
	}
}

