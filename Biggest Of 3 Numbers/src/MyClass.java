public class MyClass {
    void biggestOf3Numbers(int number1,int number2,int number3){
        int max=number1;
        if(number2>max){
            max=number2;
        } else if (number3>max) {
            max =number3;
        }
        System.out.println("Biggest of "+ number1 + ", " + number2 + " and " + number3 + " is : "+max);
    }
    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.biggestOf3Numbers(24,56,12);
        obj.biggestOf3Numbers(1889,1345,245);
        obj.biggestOf3Numbers(98739,939933,82829);
    }
}


