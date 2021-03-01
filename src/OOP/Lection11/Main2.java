package OOP.Lection11;

public class Main2 {
    public static void main (String[] agrs) {
        Staff st1 = new Staff(1, "Dinara", "Shaikhiyeva", 1000);
        Staff st2 = new Staff(2, "Larisa", "Ten", 800);
        Staff st3 = new Staff(3, "Assel", "Alikhan", 700);
        Staff st4 = new Staff(4, "Alfiya", "Toxeitova", 850);
        Staff st5 = new Staff(5, "Assel", "Koptileuova", 750);
        HRManagers hr1 = new HRManagers(11, "Alkhan Mussurmanov", 900);
        HRManagers hr2 = new HRManagers(12, "Nikolay Levadniy", 800);
        HRManagers hr3 = new HRManagers(13, "Timur Vindryaevskiy", 700);
        HRManagers hr4 = new HRManagers(14, "Zhanybek Takibayev", 600);
        HRManagers hr5 = new HRManagers(15, "Anton Tolmachev", 500);
        Programmers pr1 = new Programmers(21, "Ayushka", 1000, 200, 1);
        Programmers pr2 = new Programmers(22, "Valar13", 900, 175, 0.9);
        Programmers pr3 = new Programmers(23, "Bemoon", 800, 150, 0.8);
        Programmers pr4 = new Programmers(24, "Dendi", 1000, 125, 0.7);
        Programmers pr5 = new Programmers(25, "Artstyle", 1000, 100, 0.6);
        Workers[] workers = {st1, st2, st3, st4, st5, hr1, hr2, hr3, hr4, hr5, pr1, pr2, pr3, pr4, pr5};
        int maxsal = workers[0].getSalary();
        int indexOfMax = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getSalary() >= maxsal) {
                maxsal = workers[i].getSalary();
                indexOfMax = i;
            }
        }
        System.out.println(workers[indexOfMax].getWorkerData() + ". Salary" + workers[indexOfMax]);
//        for (int i = workers.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (workers[j].getSalary() < workers[i].getSalary()) {
//                    int tmp = workers[j].getSalary();
//                    workers[i].getSalary() = workers[j].getSalary();
//                    workers[j].getSalary() = tmp;
//                }
//            }
//        }
//        for (int i=0; i< workers.length; i++) {
//            System.out.println(workers[i] + " ");
//        }

    }
}
