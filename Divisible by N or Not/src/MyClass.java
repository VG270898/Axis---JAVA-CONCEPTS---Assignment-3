public class MyClass {
    void divisible_By_N_Or_Not(int myNumber,int N){
        if(myNumber%N == 0){
            System.out.println("" + myNumber + " is divisible by " + N);
        }
        else{
            System.out.println("" + myNumber + " is not divisible by " + N);
        }
    }

    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.divisible_By_N_Or_Not(125,5);
        obj.divisible_By_N_Or_Not(123,2);
    }
}
