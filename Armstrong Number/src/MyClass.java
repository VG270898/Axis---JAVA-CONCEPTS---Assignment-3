public class MyClass {
    void isArmstrongNiumber(int number){
        int length = (Integer.toString(number)).length();
        int rem;
        int tempNumber = number;
        int sum=0;
        while(tempNumber>0){
            rem=tempNumber%10;
            sum+=Math.pow(rem,length);
            tempNumber=tempNumber/10;
        }
        if(number==sum){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }

    public static void main(String[] args){
        MyClass obj = new MyClass();
        int myNumber = 12345;
        int mySecondNumber = 1634;
        obj.isArmstrongNiumber(myNumber);
        obj.isArmstrongNiumber(mySecondNumber);
    }
}
