package pl.edu.uj.javaframe;

import java.io.*;
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

    public void head(){
        int rows = 0;
        for(int j =0; j < columns.size(); j++) {
            System.out.print(columns.get(j).name+" ");
        }
        System.out.println();
        for(int j =0; j < columns.get(0).values.size(); j++) {
            for (int i = 0; i < columns.size(); i++) {
                columns.get(i).values.get(j).print();
                System.out.print(' ');
            }
            System.out.println();
            rows ++;
            if(rows > 5){
                return;
            }
        }
    }


    public static DataFrame readCSV(String path,Class<? extends Value>[] types) throws IOException {
        FileInputStream fstream = new FileInputStream(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        //Read File Line By Line
        DataFrame df = null;
        while ((strLine = br.readLine()) != null)   {
            // Print the content on the console
            String[] row = strLine.split(",");
            if(df == null) {
                df = new DataFrame(types, row);
            }else{
                df.addRow(row);
            }


        }

        //Close the input stream
        br.close();

        return df;
    }

    public void apply(Applayable a, String name){
        Series s = null;
        for(int i=0; i < columns.size(); i++){
            if(columns.get(i).name.equals(name)){
                s = columns.get(i);
                break;
            }
        }
        a.apply(s);
    }



}
