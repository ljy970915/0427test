package liujianyongweek2_0427.util;

import java.util.Random;

public class RandomUtil {
	//方法1：获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87（8分）
	public static double getValue(final double min, final double max,final int scale){
	//TODO 实现代码
		
		return 0.0;
	}
	//方法2：返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值（8分）
	public static int random(int min, int max){
	//TODO 实现代码
		if (max<min) {
			throw new RuntimeException();
		}
		Random r = new Random();
		int i = r.nextInt(max-min+1)+min;
		return i;
	} 
}
