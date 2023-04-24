import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("1.B 2.B 3.D 4.A 5.D\n");
        showTriangle(4);
        String s=new String();
        reverseString("ABVF");
        isPalindrome(12321);
        ShuiXianHua();
        arraysDemo();

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
    public static void showTriangle(int n){
        for (int i=0;i<n;i++){
            for (int j=n-1-i;j>0;j--){
                System.out.printf(" ");
            }
            for (int j=0;j<2*i;j++){
                System.out.printf("*");
            }
            System.out.printf("*");
            for (int j=n-1-i;j>0;j--){
                System.out.printf(" ");
            }
            System.out.println();
        }
    }
    public static void reverseString(String s){
        char[] chars = s .toCharArray();
        int n=chars.length;
        char[] charm=new char[n];
        for (int i=1;i<=n;i++){
            charm[n-i]=chars[i-1];
        }
        String s1=String.valueOf(charm);
        System.out.printf(s1);
        System.out.println();
    }
    public static void isPalindrome(int num){
        boolean flag=true;
        String s=String.valueOf(num);
        char[] chars=s.toCharArray();
        int n=chars.length;
        char[] charm=new char[n];
        for (int i=1;i<=n;i++){
            charm[n-i]=chars[i-1];
        }
        for (int i=1;i<=n;i++){
            if (charm[i-1]!=chars[i-1]){
                flag=false;
            }
        }
        if (flag){
            System.out.printf("是");
        }else {
            System.out.printf("不是");
        }
    }
    public static void ShuiXianHua(){
        int a,b,c;
        for (int i=100;i<1000;i++){
            a=i/100;
            b=(i-a*100)/10;
            c=i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void arraysDemo(){
        int[] arr=new int[10];
        for (int i=0;i<10;i++){
            arr[i]=(int)(Math.random()*100);
            System.out.print(arr[i]+",");
        }
        System.out.println();
        int num=arr[0];
        int num1=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>num){
                num=arr[i];
            }
            if (arr[i]<num1){
                num1=arr[i];
            }
        }

        System.out.print("最大值:"+num+"最小值:"+num1+"和："+(num+num1));

    }

}