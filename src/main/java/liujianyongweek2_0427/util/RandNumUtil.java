package liujianyongweek2_0427.util;

import java.text.NumberFormat;
import java.util.Random;
import java.util.stream.DoubleStream;

public class RandNumUtil {

	//����1�����ָ����Χ�����С��,����scale��ʾС�����λ��������minΪ25400.56,maxΪ67078.94,����С�����2λ��min��max֮�����������48545.87��8�֣�
		public static double getValue(final double min, final double max,final int scale){
		//TODO ʵ�ִ���
			//�򵥵�bug ����
			if (max<min) {
				throw new RuntimeException();
			}
			Random r = new Random();
			Double d=r.nextDouble()*min+(max-min);
		
			//��ȷ��С�����λ
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMaximumFractionDigits(scale);
			
			String string = nf.format(d);
			String str = string.replace(",", "");
		
			//��ʽ��Ϊdouble���͵�
			Double valueOf = Double.valueOf(str);
			return valueOf;
		}
		//����2������min-max֮����������������min�Ͳ�����maxֵ�������緵��1-3֮�����������򷵻�1��2��������������ֵ��8�֣�
		public static int random(int min, int max){
		//TODO ʵ�ִ���
			//�򵥵�bug ����
			if (max<min) {
				throw new RuntimeException();
			}
			//����min-max֮����������
			Random r = new Random();
			int i = r.nextInt(max-min+1)+min;
			return i;
		} 
	
}
