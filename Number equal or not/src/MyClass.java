public class MyClass {
    boolean numbersEqualOrNot(int number1, int number2){
        if(number1==number2){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args){
        MyClass obj = new MyClass();
        System.out.println(obj.numbersEqualOrNot(12345,345676));

        System.out.println(obj.numbersEqualOrNot(10000,10000));
    }
}
