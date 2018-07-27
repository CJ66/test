/*******************************************************************************
 * @(#)YlMilk.java 2018年4月17日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.pattern.factory;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年4月17日 下午5:59:34
 */
public class YlMilk implements Milk {
    /**
     * 创建一个新的实例 YlMilk TODO 请在每个@param,@return,@throws行尾补充对应的简要说明
     */
    public YlMilk() {
        System.out.println("创建伊利工厂");
    }

    /**
     * getName TODO 这里请补充overriding方法的简要说明 TODO 请在每个@param,@return,@throws行尾补充对应的简要说明
     * @see com.emrubik.pattern.factory.Milk#getName()
     */
    @Override
    public void getName() {
        System.out.println("伊利");
    }

}
