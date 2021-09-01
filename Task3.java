package com.syntax.class19;

public class Task3 {


   private Task3(){


   }

    Task3(String name){


    }

    protected Task3(int age){


    }


    public Task3(boolean Israining){


    }

    // main methodu ayni class icinde yapinca boyle oluyor.

    public static void main(String[]args){
       Task3 task1=new Task3();
       Task3 task2=new Task3("aga beee");
       Task3 task3=new Task3(23);
       Task3 task4=new Task3(false);



    }







}
