public class MyClass {
    String myString;

    String reverseString(String string){
        String tempString = "";
        for(int i=string.length()-1;i>-1;i--){
            tempString+=string.charAt(i);
        }

        return tempString;
    }

    public static void main(String[] args){
        MyClass obj = new MyClass();
        System.out.println(obj.reverseString("Vishal Gupta"));
        System.out.println(obj.reverseString("abcdefgh"));
    }
}
