/*******************************************************************************
 * @(#)MnMilk.java 2018年4月17日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.pattern.factory;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年4月17日 下午5:40:48
 */
public class MnMilk implements Milk{
    
    /**
     * 创建一个新的实例 MnMilk TODO 请在每个@param,@return,@throws行尾补充对应的简要说明
     */
    public MnMilk() {
        System.out.println("创建蒙牛工厂");
    }

    /** 
     * getName TODO 这里请补充overriding方法的简要说明 TODO 请在每个@param,@return,@throws行尾补充对应的简要说明
     * @see com.emrubik.pattern.factory.Milk#getName()
     */
    @Override
    public void getName() {
        System.out.println("蒙牛");
    }
}
