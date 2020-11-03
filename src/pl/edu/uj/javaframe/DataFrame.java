package pl.edu.uj.javaframe;

import java.util.ArrayList;

public class DataFrame {
    ArrayList<Series> columns = new ArrayList<>();

    public DataFrame(Class<? extends Value>[] types, String[] vals){
        for(int i = 0; i < types.length; i++){
            columns.add(new Series(types[i], vals[i]));

        }
    }

    public void addRow(String[] values){
        for(int i  = 0; i < columns.size(); i++){
            columns.get(i).addValue(values[i]);
        }
    }

    public void print(){
        for(int j =0; j < columns.get(0).values.size(); j++) {
            for (int i = 0; i < columns.size(); i++) {
                columns.get(i).values.get(j).print();
                System.out.print(' ');
            }
            System.out.println();
        }
    }



}
