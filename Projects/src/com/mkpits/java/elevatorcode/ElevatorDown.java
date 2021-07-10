package com.mkpits.java.elevatorcode;

 class ElevatorDown implements Runnable {
     public static int f;
     int current_floor,heading_floor;
     public ElevatorDown(int current_floor,int heading_floor){
       this.current_floor=current_floor;
       this.heading_floor=heading_floor;

     }

     @Override
     public void run() {
         f=1;
         int i=1;
         for(i=this.current_floor;i>=this.heading_floor;i--){
             System.out.println(i);
             ElevatorProgram.b10.setTextString.valueOf(i));
             try {
                 Thread.sleep(2000);
             }catch (Exception e){
                 System.out.println(e);
             }
         }
         f=0;

         new DoorOpen();
     }
 }