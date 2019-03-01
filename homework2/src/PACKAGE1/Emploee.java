package PACKAGE1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class Emploee  {


    public static String[] getList(int k, String namefile)  {
        try {File file = new File(namefile);
        Scanner scanner = new Scanner(file);
        int i=0;
        String[] list =new String[k];
        while((scanner.hasNextLine())&&(i<k))
        {
            list[i] = scanner.nextLine();

            i++;

        }
            return list;
        }
        catch (Exception e)
        {System.out.println("Ошибка.Файл не найден.");
            return null;}

    }


   public static String[] getListGender(int k)  {
         Random random = new Random();
       String[] out = new String[k];
       String[] values ={"м","ж"};

        for (int i=0;i<k;i++) {
            int idx=random.nextInt(values.length);
            out[i] = values[idx];
        }

        return  out;

    }


    public static String[] getListDataBith (int k,LocalDate bithdate)  {
        String[] arrbith = new String[k];

        for (int i=0;i<k;i++) {
            arrbith[i]=bithdate.toString();
                    }

        return  arrbith;

    }

    public static int[] getListAge (int k,LocalDate bithdate)  {

        LocalDate nowdate = LocalDate.now();
        Emploee Age = new Emploee();

        int[] arrage = new int[k];

        for (int i=0;i<k;i++) {
            arrage[i]=Age.calculateAge(bithdate,nowdate );
        }

        return  arrage;

    }



   public static String[] getListGeneral(int k,String namegirl[],String nameboy[],String gender[]) {
       int m = 0, s = 0;
//номер позиции в массиве c женскими и мужскими именами
       String[] general = new String[k];
       for (int n = 0; n < k; n++) { //формируем общий список имен мужских и женских
           if (gender[n].equals("м"))

           {
               general[n] = namegirl[m];
               m++;
           } else {
               general[n] = nameboy[s];
               s++;
           }


       }
       return general;
   }


    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }


    }
