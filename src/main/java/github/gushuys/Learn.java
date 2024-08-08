package github.gushuys;

import java.util.Scanner;

class Learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine();
        System.out.println(s + " " + s1);

        sc.close();
    }
}
