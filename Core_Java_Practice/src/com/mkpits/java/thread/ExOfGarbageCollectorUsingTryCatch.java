//Program of garbage collection using try catch
package com.mkpits.java.thread;

import java.io.FileOutputStream;


public class ExOfGarbageCollectorUsingTryCatch {
    public void finalize() {
        System.out.println("finalize method is called");
        try {
            fout.close();
        } catch (Exception ee) {
        }
    }
    static FileOutputStream fout;
    public static void main(String[] args){
        try {
            fout = new FileOutputStream("e://ekta//abc.txt");
            fout.write(44);
        }
        catch(Exception ee) {
        }
        ExOfGarbageCollectorUsingTryCatch g=new ExOfGarbageCollectorUsingTryCatch();
        g=null;
        System.gc();
        System.out.println("g object will be destroyed by gc");
    }
}
