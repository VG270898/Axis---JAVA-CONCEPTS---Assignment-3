public class MyClass {
    void palindromeOrNot(String myString){
        String tempString="";

        for(int i=myString.length()-1;i>-1;i--){
            tempString+=myString.charAt(i);
        }

        if(myString.equals(tempString)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }


    }

    public static void main(String[] args){
        MyClass obj = new MyClass();
        String myString= "ROTOR";
        String mySecondString = "VISHAL";
        obj.palindromeOrNot(myString);
        obj.palindromeOrNot(mySecondString);
    }
}
