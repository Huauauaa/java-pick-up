package com.hua;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

public class DateTest {
    @Test
    public void test() throws Exception {
        SimpleDateFormat df1 = new SimpleDateFormat("YYYY-MM-dd");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2021);
        c.set(Calendar.MONTH, 11);

        c.set(Calendar.DATE, 25);
        System.out.println("YYYY-MM-dd = " + df1.format(c.getTime()));
        System.out.println("yyyy-MM-dd = " + df2.format(c.getTime()));

        c.set(Calendar.DATE, 26);
        System.out.println("YYYY-MM-dd = " + df1.format(c.getTime()));
        System.out.println("yyyy-MM-dd = " + df2.format(c.getTime()));

        /**
         * YYYY 是 week-based-year, 表示: 当天所在的周属于的年份, 一周从周日开始,周六结束,只要本周跨年,那么这周就算入下一年
         */
    }
}
