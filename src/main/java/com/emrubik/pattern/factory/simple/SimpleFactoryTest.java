/*******************************************************************************
 * @(#)SimpleFactoryTest.java 2018年4月17日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.pattern.factory.simple;

import com.emrubik.pattern.factory.YlMilk;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年4月17日 下午5:48:40
 */
public class SimpleFactoryTest {
    
    public static void main(String[] args) {
        Factory factory = new MnMilkFactory();
        factory.getMilk().getName();
        
        Factory fact = new YlMilkFactory();
//        fact.getMilk();
    }
    
    
}
