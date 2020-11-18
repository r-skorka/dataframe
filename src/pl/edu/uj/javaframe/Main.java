package pl.edu.uj.javaframe;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DataFrame df = new DataFrame(new Class[] {Int.class, Int.class}, new String[] {"kol1","kol2"});

        df.addRow(new String[]{"12","23"});
        df.addRow(new String[]{"1244","23"}); df.addRow(new String[]{"1244","2553"});
        df.addRow(new String[]{"12","2300"});
        df.print();

        df.columns.get(0).values.get(0).add(new Int().create("34")).print();

        df.apply(new Adder(), "kol1");

        df.apply(new Applayable() {
            @Override
            public void apply(Series v) {
                //asdasdasd
            }
        }, "kol1");


        df.apply(v -> {
            System.out.println("OK");
        }, "kol1");

    }
}
