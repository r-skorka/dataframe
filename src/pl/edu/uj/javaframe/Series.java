package pl.edu.uj.javaframe;


import java.util.ArrayList;

public class Series {
    ArrayList<Value> values = new ArrayList<>();
    String name;
    Class<? extends Value> type;

    public Series(Class type,String name ){
        this.name = name;
        this.type = type;
    }

    public void addValue(String value){
        try {
            values.add(type.newInstance().create(value));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


}
