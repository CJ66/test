/*******************************************************************************
 * @(#)Test.java 2017年11月8日
 *
 * Copyright 2017 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.test;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2017年11月8日 下午5:07:51
 */
public class Test {
    /**
     * @param args
     */
   public static void main(String[] args) {
//      System. out .println( " 内存信息 :" + toMemoryInfo());
       
       int size = 1;
       size <<=1;
       System.out.println(size);
       size <<=1;
       System.out.println(size);
       size <<=1;
       System.out.println(size);
   }

   /**
     * 获取当前 jvm 的内存信息
     *
     * @return
     */
   public static String toMemoryInfo() {

      Runtime currRuntime = Runtime.getRuntime ();
      int nFreeMemory = ( int ) (currRuntime.freeMemory() / 1024 / 1024);
      int nTotalMemory = ( int ) (currRuntime.totalMemory() / 1024 / 1024);
      return nFreeMemory + "M/" + nTotalMemory +"M(free/total)" ;
   }
}
