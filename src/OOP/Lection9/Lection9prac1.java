package OOP.Lection9;

public class Lection9prac1 {
    public static void main (String[] args) {
        Health h1 = new Health ("1", "Arman", "Khamzin", 30, "aaa", "Maria");
        Health h2 = new Health ("2", "Askhat", "Murzabayev", 30, "aaa", "Maria");
        Sport s1 = new Sport ("3", "Ermek", "Nurgazin", 25, "Karate");
        Sport s2 = new Sport ("4", "", "Nurgazin", 25, "Karate");
        System.out.println(h1.getCitizenInfo());




    }
}
