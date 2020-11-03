package pl.edu.uj.javaframe;

abstract class Value{
    protected Object value;
    public abstract Value create(String v);
    public abstract  Value add(Value v);

    public void print(){System.out.print(value.toString());}
}