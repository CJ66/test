/*******************************************************************************
 * @(#)Test.java 2018年9月13日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.btye;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年9月13日 上午10:40:23
 */
public class Test {
    public static void main(String[] args) throws Exception {
        
        byte a= 1;
        
        byte b = 1<<4 & 0xf0;
        
        byte c = (byte) (b | a);
        
        System.out.println(c);
        
        
        String vString = "N100";
        byte[] ds= vString.getBytes();
        System.out.println(ds);
        
        
        FileInputStream fileInputStream = new FileInputStream("f:/ca/NB_Telecom-ST_UWM_MCU433_PM0_HV0_N226.bin");
        byte[] read = new byte[fileInputStream.available()] ;
        fileInputStream.read(read);
        
        System.out.println(bytesToHexString(read));
        
    }
    
    public static final String bytesToHexString(byte[] bArray) {
        StringBuffer sb = new StringBuffer(bArray.length);
        String sTemp;
        for (int i = 0; i < bArray.length; i++) {
            sTemp = Integer.toHexString(0xFF & bArray[i]);
            if (sTemp.length() < 2) sb.append(0);
            sb.append(sTemp.toUpperCase());
        }
        return sb.toString();
    }
}
