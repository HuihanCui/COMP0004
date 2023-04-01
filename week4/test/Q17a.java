public class Q17a {
    public boolean isPrime(long n)
    {
        if (n < 2L)
        {
            return false;
        }
        if (n == 2L)
        {
            return true;
        }
        if ((n % 2L) == 0)
        {
            return false;
        }
        long divisor = 3L;
        long limit = new Double(Math.sqrt(n)).longValue();
        while (divisor <= limit)
        {
            if ((n % divisor) == 0)
            {
                return false;
            }
            divisor += 2L;
        }
        return true;
    }
    public void findPrimes()
    {
        long count = 0L;
        for (long candidate = 3L; candidate < 100; candidate++)
        {
            if (isPrime(candidate))
            {
                System.out.println(candidate + " is Prime");
            }
        }
    }
    public void test(int a, int b){
        float f = 2 + 2.0;
    }
    public static void main(final String[] args)
    {
        //new Q17a().findPrimes();
        new Q17a().test(1,2);
    }
}
