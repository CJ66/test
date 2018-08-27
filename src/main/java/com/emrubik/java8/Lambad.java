/*******************************************************************************
 * @(#)Lambad.java 2018年7月3日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.java8;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

import javax.print.attribute.standard.MediaName;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年7月3日 下午12:00:27
 */
public class Lambad {
    
    static int portNumber = 1337;

    public static void main(String[] args) {

        Runnable r1 = () -> System.out.println("Hello World 1");
        r1.run();
        
        Runnable r = () -> System.out.println(portNumber);
        r.run();
        portNumber = 31337;
        
        Runnable r2 = System.out::println;
        r2.run();
        
        
        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
        
        Function<String, Integer> stringToInteger2 = Integer::parseInt ;
        
        BiPredicate<List<String>, String> contains = (list, element) -> list.contains(element);
        
        BiPredicate<List<String>, String> contains2 = List<String>::contains ;
    }
    
    
}
