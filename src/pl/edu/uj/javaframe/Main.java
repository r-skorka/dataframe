package pl.edu.uj.javaframe;

import java.io.IOException;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        DataFrame df = new DataFrame(new Class[] {Int.class, Int.class}, new String[] {"kol1","kol2"});

        df.addRow(new String[]{"12","23"});
        df.addRow(new String[]{"1244","23"}); df.addRow(new String[]{"1244","2553"});
        df.addRow(new String[]{"12","2300"});

        // Dopisz metodę print w klasie DataFrame wypisującą zawartość dataframe
        // df.print();

        // Dopisz metody w klasie Value


    }
}
