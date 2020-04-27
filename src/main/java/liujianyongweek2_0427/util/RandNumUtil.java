package liujianyongweek2_0427.util;

import java.text.NumberFormat;
import java.util.Random;
import java.util.stream.DoubleStream;

public class RandNumUtil {

	//方法1：获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87（8分）
		public static double getValue(final double min, final double max,final int scale){
		//TODO 实现代码
			//简单的bug 处理
			if (max<min) {
				throw new RuntimeException();
			}
			Random r = new Random();
			Double d=r.nextDouble()*min+(max-min);
		
			//精确到小数点后几位
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMaximumFractionDigits(scale);
			
			String string = nf.format(d);
			String str = string.replace(",", "");
		
			//格式化为double类型的
			Double valueOf = Double.valueOf(str);
			return valueOf;
		}
		//方法2：返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值（8分）
		public static int random(int min, int max){
		//TODO 实现代码
			//简单的bug 处理
			if (max<min) {
				throw new RuntimeException();
			}
			//返回min-max之间的随机整数
			Random r = new Random();
			int i = r.nextInt(max-min+1)+min;
			return i;
		} 
	
}
