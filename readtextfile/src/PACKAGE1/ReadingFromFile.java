package PACKAGE1;


import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class ReadingFromFile {

    public static void main(String[] args) throws FileNotFoundException {


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
    }
}
