package org.java17;

public record CarRecord(int no,String name) {
    public static void main(String[] ar){
        CarRecord carRecord=new CarRecord(213,"Creta");

        System.out.println(carRecord.name()+" "+carRecord.no()+" "+carRecord.getClass());
    }
}
