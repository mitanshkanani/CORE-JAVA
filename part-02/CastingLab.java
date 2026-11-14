/*
14 expressions
(byte) 200 ->          (byte) -130->          (short) 40000->
(int) 7.99 -> 7         (int) -7.99 -> -7         (int) 'z' ->122(ASCII VALUE)
(char) 98  ->b         (int) 3e9            (int) 2_147_483_648L
(byte) (100 + 100)  'a' + 1   (error everything in int)           (char) ('a' + 1)------>b
5 / 2 * 2.0--->4.0         5 / 2.0 * 2--->5.0
 */

public class CastingLab {
    public static void main(String[] args) {
        System.out.println(5 / 2 * 2.0);
        System.out.println(5 / 2.0 * 2);
        int a=(int)7.99;
        System.out.println(a);

        int b=(int)-7.99;
        System.out.println(b);
        short s=(short)40000;
        System.out.println(s);
        byte byte1=(byte)-130;
        System.out.println(byte1);
        byte byte2=(byte)200;
        System.out.println(byte2);
        int c=(int)'z';
        System.out.println(c);
        char c1=(char)98;
        System.out.println(c1);
        int x1=(int)3e9;
        int x2=(int)2_147_483_648L;
        System.out.println(x1);
        System.out.println(x2);
        byte byte3=(byte)(100+100);
        System.out.println(byte3);
        char c4='a'+1;
        System.out.println(c4);
    }
}
