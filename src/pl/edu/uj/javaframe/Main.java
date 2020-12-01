package pl.edu.uj.javaframe;

import java.io.IOException;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        /*
        DataFrame df = new DataFrame(new Class[] {Int.class, Int.class}, new String[] {"kol1","kol2"});

        df.addRow(new String[]{"12","23"});
        df.addRow(new String[]{"1244","23"}); df.addRow(new String[]{"1244","2553"});
        df.addRow(new String[]{"12","2300"});
        df.print();

        df.columns.get(0).values.get(0).add(new Int().create("34")).print();

        df.apply(new Adder("10"), "kol1");

        df.apply(new Applayable() {
            @Override
            public void apply(Series v) {
                //asdasdasd
            }
        }, "kol1");


        df.apply(v -> {
            System.out.println("OK");
        }, "kol1");
         */

        try {
            DataFrame df = DataFrame.readCSV("/home/sbk/file.csv",
                    new Class[] {Int.class, MyString.class, MyString.class,MyDouble.class,MyDouble.class});

            df.head();

            df.apply(new Adder("10"), "total");
            df.apply(new Adder("10"), "total", 10);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
