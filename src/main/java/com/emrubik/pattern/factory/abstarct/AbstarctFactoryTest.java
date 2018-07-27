/*******************************************************************************
 * @(#)AbstarctFactoryTest.java 2018年4月18日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.pattern.factory.abstarct;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年4月18日 上午9:55:28
 */
public class AbstarctFactoryTest {
    public static void main(String[] args) {
        
        MilkFactory factory = new MilkFactory();
        factory.getMnMilk().getName();
    }
}
