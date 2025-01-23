package com.mohancode.cart.Interviewprep;

class X{
    static int num=1111;

}
class Y extends X{
    static {
        num++;
    }
    {
        num++;
    }
}


public class tmpcls {
    public static void main(String[] args) {
        Y y=new Y();
        System.out.println(y.num);
    }


}
