package com.ghtn.util;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/1
 * Time: 9:43
 */
public class Test {

    public static void main(String[] args) {
    /*    char hexDigits[] = {'0', '1', '2', '3', '4',
                '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        String s = "123456";
        System.out.println(DigestUtils.md5Hex(s));
        try {
            byte[] btInput = s.getBytes();
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /*Timestamp timestamp = new Timestamp(new Date().getTime() + 12 * 3600 * 1000);
        System.out.println(timestamp);*/

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list1.add(i);
        }

        for (int i = 5; i < 9; i++) {
            list2.add(i);
        }

        System.out.println(list1.size());
        System.out.println(list2.size());

        list1.addAll(list2);
        System.out.println(list1.size());
    }
}
