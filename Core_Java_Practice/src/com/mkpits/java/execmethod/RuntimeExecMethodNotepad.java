

//WAP to open notepad with Runtime exec() method
package com.mkpits.java.execmethod;
class RuntimeExecMethodNotepad {
    public static void main(String[] args) throws Exception {
        Runtime.getRuntime().exec("notepad");//will open a new notepad
    }
}