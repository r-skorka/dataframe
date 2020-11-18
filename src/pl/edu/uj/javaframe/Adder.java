package pl.edu.uj.javaframe;

public class Adder implements Applayable
{
    @Override
    public void apply(Series s) {
        for(Value v: s.values){
            Int nv = (Int)new Int().create("10");
            System.out.println(v.add(nv).toString());
        }
    }
}
