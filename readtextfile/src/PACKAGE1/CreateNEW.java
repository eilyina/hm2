package PACKAGE1;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CreateNEW {

    public static void main(String[] args) {


        int k = 1+(int)( Math.random() * 30 );
        Emploee Emp = new Emploee();
       String[] gender  =  Emp.getListGender(k);
        //boolean[] gender = new boolean [k];


        /*Random randomGenerator = new Random(); //генерирум массив полов - gender
        for (int idx = 0; idx < k; ++idx){

            gender[idx]= randomGenerator.nextBoolean();
        }*/
        System.out.println(Arrays.toString(gender));
       System.out.println(k);

       // int i=0;
      //  int j = 0;
       // String[] surname = new String[k];
        ///String[] name = new String[k];
       /// String[] general = new String[k];

Emploee EmploerMen = new Emploee();
        String[] namemen =  EmploerMen.getList(k,"Мужские имена");
        Emploee EmploerWomen = new Emploee();
        String[] namewomen =  EmploerWomen.getList(k,"Женские имена");


        Emploee EmploerMen2 = new Emploee();
        String[] surnamemen =  EmploerMen2.getList(k,"Мужские фамилии");
        Emploee Emploerwomen2 = new Emploee();
        String[] surnamewomen =  Emploerwomen2.getList(k,"Женские фамилии");

        Emploee EmploerMen3 = new Emploee();
        String[] middlenamemen =  EmploerMen3.getList(k,"Мужские Отчества");
        Emploee Emploerwomen3 = new Emploee();
        String[] middlenamewomen =  Emploerwomen3.getList(k,"Женские Отчества");

        Emploee Country = new Emploee();
        String[] country =  Country.getList(k,"Страны");

        Emploee Region = new Emploee();
        String[] region =  Region.getList(k,"Область");

        Emploee Street = new Emploee();
        String[] street =  Street.getList(k,"Улицы");

        Emploee EmploerGeneralName = new Emploee();
        String[] generalname =  EmploerGeneralName.getListGeneral(k,namemen,namewomen,gender);
        Emploee EmploerGeneralSurName = new Emploee();
        String[] generalsurname =  EmploerGeneralSurName.getListGeneral(k,surnamemen,surnamewomen,gender);
        Emploee EmploerGeneralMiddle = new Emploee();
        String[] generalmiddlename =  EmploerGeneralMiddle.getListGeneral(k,middlenamemen,middlenamewomen,gender);


      //  Emploee EmploerOUT= new Emploee();
     //   String[] outname =  EmploerOUT.getListGender(k);
        //System.out.println(outname);


        Randomdata IndexAddress = new Randomdata();
        int[] listIndexAddress = IndexAddress.getIndexList(k);


        Workbook book = new HSSFWorkbook();
        Sheet sheet = book.createSheet("Cписок");

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
            name15.setCellValue(generalname[count1]);

            Cell name16 =  row16.createCell(1);
            name16.setCellValue(generalsurname[count1]);
            Cell name17 =  row16.createCell(2);
            name17.setCellValue(generalmiddlename[count1]);
            Cell name18 =  row16.createCell(8);
            name18.setCellValue(country[count1]);
            Cell name19 =  row16.createCell(9);
            name19.setCellValue(region[count1]);
            Cell name20 =  row16.createCell(10);
            name20.setCellValue(street[count1]);
            Cell name21 =  row16.createCell(7);
            name21.setCellValue(listIndexAddress[count1]);
            Cell name22 =  row16.createCell(4);
            name22.setCellValue(gender[count1]);
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
