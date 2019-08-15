package com.usts.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2019/8/14.
 */
public class JavaTest {

    public static void main(String[] args) {
        List<Object> lists = new ArrayList<Object>();

        lists.add("1");
        lists.add("2");
        lists.add("3");
        lists.add("4");

        List<Object> tempList = lists.subList(2, lists.size());

        tempList.add("6");

        System.out.println(tempList); // 1

        System.out.println(lists); // 2
    }

}
