package org.example;

import java.util.ArrayList;

public class Check {
    int count;
    int checkError;
    String checkFamily;

    public boolean check_0(StringBuilder strB) {
        count = 0;
        for (int i = 0; i < strB.length(); i++) {
            String a = String.valueOf(strB.charAt(i));
            if (a.equals(" ")) {
                count += 1;
            }
        }
        if (count == 5) {
            checkError = 0;
            return true;
        } else {
            checkError = -1;
            System.out.println("\tВведено меньше или больше данных, чем требуется.");
            System.out.println("\tВведите еще раз данные!");
            return false;
        }
    }

    public void check_1(ArrayList<String> list) {
        checkFamily = list.get(0);
        String checkName = list.get(1);
        String checkPatronymic = list.get(2);
        String checkBirth = list.get(3);
        String checkPhone = list.get(4);
        String checkGender = list.get(5);
        if (!checkFamily.matches("[а-яА-Я]+")) {
            throw new RuntimeException("Ввод фамилии не верный! Введите фамилию кириллицей.");
        }
        if (!checkName.matches("[а-яА-Я]+")) {
            throw new RuntimeException("Ввод имени не верный! Введите имя кириллицей.");
        }
        if (!checkPatronymic.matches("[а-яА-Я]+")) {
            throw new RuntimeException("Ввод отчества не верный! Введите отчество кириллицей.");
        }

        String[] b = checkBirth.split("\\.");
        int count = 0;
        boolean fl;
        boolean fl1;
        for (String s : b) {
            if (s.matches("[0-9]+")) {
                count += 1;
            }
        }
        fl = count != 3;
        fl1 = b[0].length() != 2 || b[1].length() != 2 || b[2].length() != 4;

        if (fl || fl1) {
            throw new RuntimeException("Ввод даты рождения не верный!");
        }
        if (!checkPhone.matches("[0-9]+")) {
            throw new RuntimeException("Ввод номера телефона не верный! Введите номер цифрами, через 8");
        }
        if (!checkGender.matches("[mf]+")) {
            throw new RuntimeException("Ввод пола не верный! Введите m - мужчина, f - женщина");
        }
    }
}
