package com.handsome.javaBasic;

public class stringBuffer {
    public static void main(String[] args) {
        int total = 10000;
        String s = randomString(10);
        StringBuffer sb = new StringBuffer();

        String str1 = "";
        long start = System.currentTimeMillis();

        for (int i = 0; i < total; i++) {
            str1 += s;
        }
        long end = System.currentTimeMillis();
        System.out.printf("使用字符串连接+的方式，连接%d次，耗时%d毫秒%n", total, end - start);
        total *= 100;
        start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            sb.append(s);
        }
        end = System.currentTimeMillis();
        System.out.printf("使用StringBuffer的方式，连接%d次，耗时%d毫秒%n", total, end - start);

    }

    private static String randomString(int length) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
}
