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
			TPS tps = new TPS(BigInteger.valueOf(i), ZHStringUtil.getZHName(), RandomUtil.random(1, 100),
					BigDecimal.valueOf(RandNumUtil.getValue(30000.0, 80000.0, 2))
				, DateUtil.random(parse,new Date()));
			System.out.println(tps);
		}
	}
}
