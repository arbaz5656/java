import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Arbaz!");
        byte v0=122;
        int v=1234567890;
        char v1='f';
        long v2=1234567890123456789L;
        System.out.println(v);
        System.out.println(v1);
        System.out.println(v0);
        System.out.println(v2);
        short v3=32134;
        System.out.println(v3);
        boolean v4=true;
        System.out.println(v4);
        float v5=3.14F;
        System.out.println(v5);

//        Non primitive
//        String v6 = "apu";
        String v6= new String( "apu");
        System.out.println(v6);

//      concatination
        String v7="shaikh";
        String v8="Arbaz";
        String v9=v7 + " " +v8;
        System.out.println(v9);

        System.out.println(v8.charAt(0));
        System.out.println(v8.length());
        System.out.println(v8.length());
        String v10=v7.replace("shaikh","Shaikh");
        System.out.println(v10+" "+v8);
        System.out.println(v9.substring(0,6));
        System.out.println(v9.substring(7,12));

//        Array
        int[] rno=new int[3];
        rno[0]= 26;
        rno[1]= 13;
        rno[2]= 32;
        System.out.println(rno[2]);
        System.out.println(rno.length);
//      2nd way to store array
        int[] rollno={31,32,26,33,27,13};
        System.out.println(rollno[2]);

        Arrays.sort(rollno);
        System.out.println(rollno[2]);

//      2D arrays
        int[][] marks={{32,40,45},{40,50,32}};
        System.out.println(marks[0][1]); //1st ka 2nd marks
        System.out.println(marks[1][2]); //2nd ka 3rd marks
//      Casting
        float va=28.8F;
        System.out.println(va);
        int vb=8 +(int)28.9F;
        System.out.println(vb);
//      Change variable Value
//        int vc=26;
//        vc=25;
//        System.out.println(vc);

//      Constant
        final int vc=25;
//        vc=49;
        System.out.println(vc);

//      Operators:
//      arithmetic operator
        double o1=14;
        double o2=3;
        double o3=o1%o2;
        System.out.println(o3);
//      Assignment Oprator
//        double a1=1;
//        a1=a1+2;
//        System.out.println(a1);
//
//        double a1=1;
//        a1++;
//        System.out.println(a1);

//        double a1=1;
//        a1+=2;
//        System.out.println(a1);

//        double a1=1;
//        a1-=2;
//        System.out.println(a1);
//
//        double a1=1;
//        a1=10;
//        ++a1;
//
//        System.out.println(a1);

//      Math
        System.out.println(Math.max(3,2));
        System.out.println(Math.min(3,2));
        System.out.println(Math.random());
        System.out.println((Math.random()*10));
        System.out.println((int)(Math.random()*10));
//
//
//      Input
//        Scanner s1=new Scanner(System.in);
//        System.out.println("entrt yor name");
//        String name=s1.next();
//        System.out.println(name);
//
//        Scanner s2=new Scanner(System.in);
//        System.out.println("entrt yor agea");
//        String n1=s2.next();
//        System.out.println(n1);
//
//        Scanner m3=new Scanner(System.in);
//        System.out.println("Print Float number");
//        float n2=m3.nextFloat();
//
//        System.out.println(n2);
//
//        Scanner m4=new Scanner(System.in);
//        float n3=m4.nextInt();
//        System.out.println("Print integer number");
//

//
////if else condition statement
////        int age=22;
//        Scanner i=new Scanner(System.in);
//        System.out.println("Enter Your age:");
//        int age=i.nextInt();
//        if (age>=18){
//            System.out.println("yes, You are eligible.");
//        }
//        else{
//            System.out.println("No,You are not eligible.");
//        }


//        for loop
        for (int i=0;i<=100;i++){
            System.out.println(i);
        }

//         While loop
        int j=100;
        while (j>=0){
            System.out.println(j);
            j--;
        }

//      Do while Loop
        int k=2;
        do {
            System.out.println(k);
            k++;
        }while (k<=9);


//break and Continue

        String [] variable={"Apple","Banana","Samosa","Orange","Mango","Vada","Bhajiya"};
        for (int i=0;i<=6;i++){
            if (variable[i]=="Samosa" ) {
                continue;
            }
            else if (variable[i]=="Bhajiya"){
                break;
            }

            System.out.println(variable[i]);
        }

//        Exception Handling(Try & Catch)
        int [] vr={23,45,67,77,343,44};
        try {
            System.out.println(vr[5]);
        }
        catch (Exception exception)
        {
            // Something Here
        }
        System.out.println("Hello Arbaz");




    }
}