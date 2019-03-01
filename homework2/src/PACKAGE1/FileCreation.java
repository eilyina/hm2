package PACKAGE1;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.Arrays;

public class FileCreation {

    public static void main(String[] args) {

String pathfile = "C:"+File.separator+"Тест"+File.separator+"Тест.xlsx";
        int listsize = 1+(int)( Math.random() * 30 );
        Emploee Gender= new Emploee();
       String[] gender  =  Gender.getListGender(listsize);

        System.out.println(Arrays.toString(gender));
       System.out.println(listsize);


Emploee EmploerMen = new Emploee();
        String[] namemen =  EmploerMen.getList(listsize,"Мужские имена");
        Emploee EmploerWomen = new Emploee();
        String[] namewomen =  EmploerWomen.getList(listsize,"Женские имена");


        Emploee EmploerMen2 = new Emploee();
        String[] surnamemen =  EmploerMen2.getList(listsize,"Мужские фамилии");
        Emploee Emploerwomen2 = new Emploee();
        String[] surnamewomen =  Emploerwomen2.getList(listsize,"Женские фамилии");

        Emploee EmploerMen3 = new Emploee();
        String[] middlenamemen =  EmploerMen3.getList(listsize,"Мужские Отчества");
        Emploee Emploerwomen3 = new Emploee();
        String[] middlenamewomen =  Emploerwomen3.getList(listsize,"Женские Отчества");

        Emploee Country = new Emploee();
        String[] country =  Country.getList(listsize,"Страны");

        Emploee Region = new Emploee();
        String[] region =  Region.getList(listsize,"Область");

        Emploee Street = new Emploee();
        String[] street =  Street.getList(listsize,"Улицы");

        Emploee EmploerGeneralName = new Emploee();
        String[] generalname =  EmploerGeneralName.getListGeneral(listsize,namemen,namewomen,gender);
        Emploee EmploerGeneralSurName = new Emploee();
        String[] generalsurname =  EmploerGeneralSurName.getListGeneral(listsize,surnamemen,surnamewomen,gender);
        Emploee EmploerGeneralMiddle = new Emploee();
        String[] generalmiddlename =  EmploerGeneralMiddle.getListGeneral(listsize,middlenamemen,middlenamewomen,gender);



        RandomDataMy IndexAddress = new RandomDataMy();
        int[] listIndexAddress = IndexAddress.getIndexList(listsize);


        XSSFWorkbook book = new XSSFWorkbook();
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
        for (int n = 1; n <= listsize; n++)
        {
            Row row16 = sheet.createRow(n);

            LocalDate randomdate = RandomData.randomBirthday();

            Emploee DateOfBirth = new Emploee();
            String[] datebirth= DateOfBirth.getListDataBith(listsize,randomdate);

            Emploee Age = new Emploee();
            int[] age= Age.getListAge(listsize,randomdate);
            Cell name15 =  row16.createCell(0);
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


            Cell namedata1 = row16.createCell(5);
            namedata1.setCellValue(datebirth[count1]);

            Cell nameage1 = row16.createCell(3);
            nameage1.setCellValue(age[count1]);

        count1 ++;
        }


        try {

           FileOutputStream fileOut = new FileOutputStream(new File(pathfile));
           book.write(fileOut);
           fileOut.close();
            System.out.println("Файл создан.Путь "+pathfile);
        }
        catch (Exception e)
        {System.out.println("Ошибка при создании файла.Файл не создан.");}


        }
    }
