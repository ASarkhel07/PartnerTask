@FunctionalInterface
public interface addNumbers {
    int addNumbersMethod(int start, int end);

    default int addNumbersMethodFarees(int start, int end)
    {
        int sum=0;
        for(int x=start;x<=end;x++)
        {
            sum+=x;
        }
        return sum;
    }
}


