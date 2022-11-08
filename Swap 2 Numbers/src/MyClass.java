public class MyClass {
    void swap2Numbers(int number1, int number2){
        System.out.println("Original numbers are:\nNumber1 : " + number1 + "\tNumber2 : " + number2);
        number1 = number2+number1;
        number2 = number1-number2;
        number1 = number1-number2;
        System.out.println("After Swapping numbers are:\nNumber1 : " + number1 + "\tNumber2 : " + number2);
    }

    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.swap2Numbers(10,7);
        System.out.println();
        obj.swap2Numbers(5,8);
    }
}
