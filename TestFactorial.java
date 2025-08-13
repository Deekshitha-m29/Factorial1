public class TestFactorial {
    public static void main(String args[]){
        try{
            if(Factorial.compute(5)!=120){
                throw new AssertionError("Test case failed for 5");
            }
            if(Factorial.compute(0)!=1){
                throw new AssertionError("Test case failed for 0");
            }
            System.out.println("All test cases passed");
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
