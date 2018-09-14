/*******************************************************************************
 * @(#)TestBase64Demo.java 2018年9月10日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.base64;

import org.apache.commons.codec.binary.Base64;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年9月10日 上午10:36:11
 */
public class TestBase64Demo {
    public static void main(String[] args) {
        String aString = "0RKgTjEwMAgICAgICAgI";
        byte[] bs = Base64.decodeBase64(aString);
        String str = bytesToHexString(bs);
        System.out.println(str);
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
