package me.crazystone.study.test;

/**
 * Created by crazystone on 17-7-10.
 */
public class MathTest {

    public static void main(String... args) {

        float radains = (float) ((Math.PI / 180f) * 60);

//        System.out.println(Math.sin(radains));

        Lunars.Lunar lunar = Lunars.solarToLunar(new Lunars.Solar(2017, 7, 26));
        System.out.println("lunar:" + lunar.toString());
        System.out.println("lunar day:" + Lunars.getLunarDayString(lunar.lunarDay));

        System.out.println(Lunars.daysInLunarMonth(2017, 6));
//        System.out.println(Lunars.leapMonth());

        System.out.println(getMothDayString(6,2));
    }

    private static String getMothDayString(int month, int day) {
        StringBuilder sb = new StringBuilder();
        month += 1;
        return sb.append(month / 10 >= 1 ? month : "0" + month).append(day / 10 >= 1 ? day : "0" + day).toString();
    }


}
