package com.java.ds.Basic;


enum Direction{
    NORTH("I can see the Sun"),
    SOUTH("I can still see the Sun"),
    WEST("Sen sets in the west"),
    EAST("Sun rises in the East");

    String msg;

    private Direction(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    
}
public class EnumExample {

    
    public static void main(String[] args) {
        for(Direction direction : Direction.values()){
            System.out.println(direction.toString());
        }
    }
}
