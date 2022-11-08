public class MyClass {
    void last2DigitOfYear(int year){
        int last2Digit;
        String l;
        if(year%100==0){
            last2Digit = 0;
        }
        else{
            last2Digit = year%100;
        }

        System.out.println("Last Two digit Number of given year " +year + " is : " + last2Digit);
    }
    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.last2DigitOfYear(2022);
        obj.last2DigitOfYear(2019);
        obj.last2DigitOfYear(2000);
        obj.last2DigitOfYear(1988);
    }
}
