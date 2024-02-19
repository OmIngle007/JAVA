class Prime{




	public static void main(String args[]){
	
         int size = 1000000;
         long[] string1 = calculateTime(size);
        for(int i=0;i<size;i++){
        System.out.println(string1[i]);
        }
        int timer = 1;
        while(timer<=5){
        long startTime = System.currentTimeMillis();
        long NonprimeCount = approach1(string1);
        System.out.println("The total number of non-Prime numbers by approach1 are:" + NonprimeCount);
        System.out.println("The total number of Prime numbers by approach1 are:" +(1000000 - NonprimeCount));
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("time taken by approach 1 is :"+elapsedTime);
        
        long startTime1 = System.currentTimeMillis();
        int primeCount = approach2(string1);
        System.out.println("The total number of Prime numbers by approach 2 are:" + primeCount);
        System.out.println("The total number of non-Prime numbers by approach 2 are:" + (1000000 - primeCount));
         long elapsedTime1 = System.currentTimeMillis() - startTime1;
        System.out.println("time taken by approach 2 is :"+elapsedTime1);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         timer++;
         }
         
	}
	
	public static long approach1(long[] number){
	int count=0;
	for(int i=0;i<number.length;i++){
        long a = number[i];
		if(isPrime(a)==false){
		count++;
		}
	}	
	return count;
        }
        
        public static int approach2(long[] number){
	int pcount=0;
	for(int i=0;i<number.length;i++){
        long a = number[i];
		if(isPrime(a)==true){
		pcount++;
		}
	}	
	return pcount;
        }
        
      

          public static boolean isPrime(long s) {
    if (s < 2) {
        return false;
    }
    
    for (int i = 2; i <= Math.sqrt(s); i++) {
        if (s % i == 0) {
            return false;
        }
    }
    return true;
}
        	
       
	
	public static long[] calculateTime(int size){
	
	long[]  regNo = new long[size];
	
	
	for(int i=0;i<size;i++){
	regNo[i] = GenerateRandomNumber();
	} 
	
	return regNo;
	
	
	}
	
	public static  long GenerateRandomNumber(){

		
	 long currentTimeMillis = System.nanoTime();
        long sevenDigitNumber = currentTimeMillis % 10000000;
		
        return sevenDigitNumber;
	
	}
	}
