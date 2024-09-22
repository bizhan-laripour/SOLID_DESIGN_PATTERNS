package org.example.ceational.prototype;

public abstract class Shape implements Cloneable{

    private String id;
    private String name;
    abstract void draw();

    @Override
    public Object clone() {
        Object clone = null;
        try{
            clone = super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
