package org.example;

import java.io.*;

public class File_W {

    public void writeFile(String name, StringBuilder strB) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/" + name);
            File file = new File(pathFile);

            FileWriter fileWriter;
            if (file.createNewFile()) {
                fileWriter = new FileWriter(file, true);
                fileWriter.write(String.valueOf(strB));
                System.out.println("Файл с именем '" + name +"' успешно создан.");
                System.out.println("Данные записаны: " + strB);
            } else {
                fileWriter = new FileWriter(file, true);
                fileWriter.write("\n" + strB);
                System.out.println("Данные в файл '" + name +"' успешно добавлены.");
                System.out.println("Данные записаны: " + strB);
            }

            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Файл не найден.");
        }

    }


}
