public class MyClass {

    void isLeapYear(int year){
        if(year%4==0){
            if(year%100==0 && year%400==0){
                System.out.println("Year is Leap Year");
            }
            else if (year%100==0 && year%400!=0){
                System.out.println("Year is Not Leap Yaer");
            }
            else{
                System.out.println("Year is Leap Year");
            }

        }
        else{
            System.out.println("Year is Not Leap Year");
        }
    }

    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.isLeapYear(2016);
        obj.isLeapYear(2019);
        obj.isLeapYear(1400);
        obj.isLeapYear(1600);
    }
}
