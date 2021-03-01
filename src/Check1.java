import java.util.Scanner;
public class Check1 {
    public static void main (String[] args){
       Scanner in = new Scanner(System.in);
        String name = "Name:";
        String surname = "Surname: ";
        String age = "Age: ";
        String country = "Country: ";
        String insert = "Insert your ";
        System.out.println(insert+name);
        String a = in.next();
        System.out.println(insert+surname);
        String b = in.next();
        System.out.println(insert+age);
        String c = in.next();
        System.out.println(insert+country);
        String d = in.next();
        System.out.println(name+a);
        System.out.println(surname+b);
        System.out.println(age+c);
        System.out.println(country+d);
        System.out.println();
        System.out.println(insert+name);
        String e = in.next();
        System.out.println(insert+surname);
        String f = in.next();
        System.out.println(insert+age);
        String g = in.next();
        System.out.println(insert+country);
        String h = in.next();
        System.out.println(name+e);
        System.out.println(surname+f);
        System.out.println(age+g);
        System.out.println(country+h);
    }
}
