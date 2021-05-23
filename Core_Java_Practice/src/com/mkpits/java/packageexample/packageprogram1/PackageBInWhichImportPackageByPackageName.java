//A program of package import another package using package name
package com.mkpits.java.packageexample.packageprogram1;
import com.mkpits.java.packageexample.packageprogram.*;

public class PackageBInWhichImportPackageByPackageName {
  public static void main(String[] args){
      PackageAWhichImportByPackageName obj=new PackageAWhichImportByPackageName();
      obj.msg();


  }

}
