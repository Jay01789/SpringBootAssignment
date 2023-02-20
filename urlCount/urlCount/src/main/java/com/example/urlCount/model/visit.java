package com.example.urlCount.model;

public class visit {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public visit(int count){
        this.count = count ;
    }

    @Override
    public String toString() {
        return "visit{" +
                "count=" + count +
                '}';
    }
}
