package liujianyongweek2_0427.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static Date random(Date min,Date max ) {
		long t1= min.getTime();
		long t2= max.getTime();
		long t=(long)	(Math.random()*(t2-t1)+t1);
	return new Date(t);
	}
	//根据日期计算年龄
	public static int getAgeByBirthday(Date  birthday) {
		Calendar c = Calendar.getInstance();
		
		int nowYear = c.get(Calendar.YEAR);
		int nowMonth = c.get(Calendar.MONTH);
		int nowDate = c.get(Calendar.DAY_OF_MONTH);
		
		Calendar c2 = Calendar.getInstance();
		c2.setTime(birthday);
		int birthdayYear = c2.get(Calendar.YEAR);
		int birthdayMonth = c2.get(Calendar.MONTH);
		int birthdayDate = c2.get(Calendar.DAY_OF_MONTH);
		
		
		if(nowYear< birthdayYear)
			throw new RuntimeException("日期错误");
		int age =  nowYear - birthdayYear;
		if(nowMonth < birthdayMonth  ) 
		    age--;
		 if(nowMonth ==birthdayMonth && nowDate<birthdayDate )
			 age--;
		return age;
	}
	//根据传入的日期返回日期的月初
	public static Date getInitMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND,0);
		return c.getTime();
	}
	
	// 根据传入的日期返回日期的月末
	public static Date getEndMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		c.add(Calendar.MONTH, 0);
		Date initMonth = getInitMonth(c.getTime());
		c.setTime(initMonth);
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	}
	
}
