/*******************************************************************************
 * @(#)MnMilkFactory.java 2018年4月17日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.pattern.factory.simple;

import com.emrubik.pattern.factory.Milk;
import com.emrubik.pattern.factory.MnMilk;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年4月17日 下午5:40:18
 */
public class MnMilkFactory implements Factory {

    /**
     * getMilk TODO 这里请补充overriding方法的简要说明 TODO 请在每个@param,@return,@throws行尾补充对应的简要说明
     * @see com.emrubik.pattern.factory.simple.Factory#getMilk()
     */
    @Override
    public Milk getMilk() {
        return new MnMilk();
    }

}
