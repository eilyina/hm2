package PACKAGE1;
import java.io.*;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class CreateExel {

    public static void main(String[] args) throws FileNotFoundException{

        File filesurname = new File("Женские имена");
        File filename = new File("Мужские имена");


        Scanner scanner = new Scanner(filesurname);
        Scanner scanner2 = new Scanner(filename);

        int k = 1+(int)( Math.random() * 30 );
        boolean[] gender = new boolean [k];


        Random randomGenerator = new Random(); //генерирум массив полов - gender
        for (int idx = 0; idx < k; ++idx){

            gender[idx]= randomGenerator.nextBoolean();
        }
        System.out.println(Arrays.toString(gender));
        System.out.println(k);

        int i=0;
        int j = 0;
        String[] surname = new String[k];
        String[] name = new String[k];
        String[] general = new String[k];



        while((scanner.hasNextLine())&&(i<k))
        {
            surname[i] = scanner.nextLine();

            i++;

        }

        while ((scanner2.hasNextLine())&&(j<k))
        {

            name[j] = scanner2.nextLine();

            j++;
        }

        System.out.println(Arrays.toString(surname));
        System.out.println(Arrays.toString(name));

        scanner.close();
        scanner2.close();


        int m=0,s=0;
//номер позиции в массиве

        for (int n = 0; n < k; n++) { //формируем общий список имен мужских и женских
            if (gender[n] == true)
            { general[n] = surname[m];
                m ++;}
            else
            {general[n] = name[s];
                s++;}

        }
        System.out.println(Arrays.toString(general));







        Workbook book = new HSSFWorkbook();
        Sheet sheet = book.createSheet("Birthdays");

        Row row = sheet.createRow(0);
        Cell name14 = row.createCell(0);
        name14.setCellValue("Имя");

        Cell name2 = row.createCell(1);
        name2.setCellValue("Фамилия");

        Cell name3 = row.createCell(2);
        name3.setCellValue("Отчество");

        Cell name4 = row.createCell(3);
        name4.setCellValue("Возраст");

        Cell name5 = row.createCell(4);
        name5.setCellValue("Пол");

        Cell name6 = row.createCell(5);
        name6.setCellValue("Дата рождения");

        Cell name7 = row.createCell(6);
        name7.setCellValue("ИНН");

        Cell name8 = row.createCell(7);
        name8.setCellValue("Почтовый индекс");

        Cell name9 = row.createCell(8);
        name9.setCellValue("Страна");

        Cell name10 = row.createCell(9);
        name10.setCellValue("Область");

        Cell name11 = row.createCell(10);
        name11.setCellValue("Улица");

        Cell name12 = row.createCell(11);
        name12.setCellValue("Дом");

        Cell name13 = row.createCell(12);
        name13.setCellValue("Квартира");

        int count1 =0;
        for (int n = 1; n <= k; n++)
        { Row row15 = sheet.createRow(n);
            Row row16 = sheet.createRow(n);
            Cell name15 =  row15.createCell(0);
            name15.setCellValue(general[count1]);

            Cell name16 =  row16.createCell(4);
            name16.setCellValue(gender[count1]);
        count1 ++;
        }

        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Ilyin\\Downloads\\test.xls");
            book.write(fileOut);
            fileOut.close();
            System.out.println("Файл создан");
        }
        catch (Exception e)
        {System.out.println("Ошибка.Файл не создан.");}


        }
    }
