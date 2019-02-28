package PACKAGE1;

import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class Emploee {

   // String name;
   // String namefile;
  //  String surname;
  //  String secondname;
   // char gender;
  // String[] gender = new String[];
   //String[] surname = new String[k];
   // String[] name = new String[k];
    //String[] general = new String[k];

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

 /*  public static Boolean[] getListGender(int k)  {
        Random randomGenerator = new Random(); //генерирум массив полов - gender
        Boolean[] gender = new Boolean[k];
        for (int idx = 0; idx < k; ++idx){

            gender[idx]= randomGenerator.nextBoolean();
        }

return gender;
    }*/

   public static String[] getListGender(int k)  {
         Random random = new Random();
       String[] out = new String[k];
       String[] values ={"м","ж"};
      //  String out = "";

        for (int i=0;i<k;i++) {
            int idx=random.nextInt(values.length);
            out[i] = values[idx];
        }

        return  out;

    }





   public static String[] getListGeneral(int k,String namegirl[],String nameboy[],String gender[]) {
       int m = 0, s = 0;
//номер позиции в массиве
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


    }
