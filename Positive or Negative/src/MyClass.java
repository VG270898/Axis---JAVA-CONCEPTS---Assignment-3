public class MyClass {

    void positiveOrNegative(int myNumber){
        if(myNumber>0){
            System.out.println("Number is Positive");
        } else if (myNumber<0) {
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is Zero");
        }
    }

    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.positiveOrNegative(1234);
        obj.positiveOrNegative(-343);
        obj.positiveOrNegative(0);
    }
}
