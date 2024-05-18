public class TryCatch {
    public static void main(String[] args) throws Exception {
        try{
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("The 'Try Catch' is finished");
        }
    }
}