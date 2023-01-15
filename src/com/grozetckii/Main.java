package com.grozetckii;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        StringCompare sc = (s1, s2) -> (s1.length() > s2.length()) ? s1 : s2;
        String s1, s2, max;
        Scanner scan = new Scanner(new File("C:\\Users\\Urapochka\\IdeaProjects\\FEFU_JAVA_LW_10\\src\\com\\grozetckii\\file.txt"));
        s1 = scan.nextLine();
        s2 = scan.nextLine();
        max = sc.twoStringCompare(s1, s2);
        while(scan.hasNext()){
            s1 = s2;
            s2 = scan.nextLine();
            max = sc.twoStringCompare(max, s2);
        }
        System.out.println(sc.twoStringCompare(s1, s2));
    }
}
