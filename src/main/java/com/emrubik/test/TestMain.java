/*******************************************************************************
 * @(#)TestMain.java 2017年11月9日
 *
 * Copyright 2017 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2017年11月9日 上午11:54:54
 */
public class TestMain {
    public static void main(String[] args) {

        Persion p = new Persion();
        p.setAge(12);
        p.setBir(new Date(2017, 4, 13));
        p.setName("AA");

        Persion p2 = new Persion();
        p2.setAge(11);
        p2.setBir(new Date(2017, 4, 14));
        p2.setName("BB");

        Persion p3 = new Persion();
        p3.setAge(14);
        p3.setBir(new Date(2017, 4, 11));
        p3.setName("CC");

        List<Persion> list = new ArrayList<>();
        list.add(p);
        list.add(p2);
        list.add(p3);

        System.out.println(list.toString());

        list.sort(new Comparator<Persion>() {

            @Override
            public int compare(Persion o1, Persion o2) {
                if (o1.getAge() > o2.getAge())
                    return 1;
                // else if(o1.getAge()==o2.getAge())
                // return 0;
                else
                    return -1;
                // return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list);

        list.sort(new Comparator<Persion>() {

            @Override
            public int compare(Persion o1, Persion o2) {

                if (o1.getBir().getTime() > o2.getBir().getTime())
                    return -1;
                else if (o1.getBir().getTime() == o2.getBir().getTime())
                    return 0;
                else
                    return 1;

            }

        });
        System.out.println(list);

    }
}
