// Sum.java
class Sum {
    public static void main(String args[])
    {
        int sum = 0;
        for (int i=1; i<=10; i++) sum += i;
		System.out.printf("Sum 1-10 " + "= "+sum);
        System.out.println("Sum 1-10\n = %d\n"+sum);
		// %d is not unnecessary if you use + instead of , use printf in that case
		System.out.printf("Sum 1-10\n = %d\n",sum); // displays well
		// also use println instead of \n
		// \n works well here
    }
}