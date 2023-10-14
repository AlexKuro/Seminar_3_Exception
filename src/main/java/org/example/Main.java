package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder strB = new StringBuilder();
        File_W fileRW = new File_W();
        Check check = new Check();
        Parse parse = new Parse();
        boolean fl;

        Scanner scanner = new Scanner(System.in);
        do {
            do {
                strB.setLength(0);
                System.out.print("""
                        \n\tДля регистрации введите следующие данные:
                        \tФамилия Отчество Имя ДатуРождения НомерТелефона ПОЛ
                        \tДанные разделяйте 'пробелом'
                        Введите данные:\s""");
                strB.append(scanner.nextLine());
            } while (!check.check_0(strB));

            try {
                ArrayList<String> list = new ArrayList<>(parse.parse(strB));
                check.check_1(list);
                fl = false;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                fl = true;
            }
        } while (fl);

        fileRW.writeFile(check.checkFamily, strB);
    }
}