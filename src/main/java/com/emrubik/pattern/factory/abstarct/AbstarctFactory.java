/*******************************************************************************
 * @(#)AbstarctFactory.java 2018年4月18日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.pattern.factory.abstarct;

import com.emrubik.pattern.factory.Milk;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年4月18日 上午9:52:25
 */
public abstract class AbstarctFactory {
    
    public abstract Milk getMnMilk();
    
    public abstract Milk getYlMilk();
    
}
