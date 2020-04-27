package liujianyongweek2_0427.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import liujianyongweek2_0427.entity.TPS;
import liujianyongweek2_0427.util.DateUtil;
import liujianyongweek2_0427.util.RandNumUtil;
import liujianyongweek2_0427.util.RandomUtil;
import liujianyongweek2_0427.util.ZHStringUtil;

public class TPSTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		String str = "2020-1-1";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = sdf.parse(str);
		
		

		for (int i = 1; i <=100; i++) {
			TPS tps = new TPS(BigInteger.valueOf(i), //id从1开始递增
					ZHStringUtil.getZHName(), //姓名属性值调用ZHStringUtil的getZHName()
					RandomUtil.random(1, 100),//年龄属性值调用RandomUtil.random()创建，必须在1-100岁之间
					BigDecimal.valueOf(RandNumUtil.getValue(30000.0, 80000.0, 2)), //薪酬是3万到8万，小数点后2位的随机数
					DateUtil.random(parse,new Date()));//聘用日期属性值模拟2012年1月1日至今任意随机时间
			System.out.println(tps);//循环打印对象
		}
	}
}
