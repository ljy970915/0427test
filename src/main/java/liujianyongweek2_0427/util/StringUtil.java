package liujianyongweek2_0427.util;

import java.util.Random;

public class StringUtil {
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static boolean hasLength(String src){
		if("".equals(src.trim())){
			return false;
		}
		if (src==null) {
			return false;
		}
		
		return true;
	//TODO 实现代码
	}
	//方法2：判断源字符串	
	public static boolean hasText(String src){
		
		
		return null != src && src.trim().length() > 0;
	//TODO 实现代码
	}
	

	
	// 判断一个字符串是否是数字 考虑整数 负数 小数
	public static boolean isNumber(String src) {
			String reg = "^(-)?[0-9]+(\\.[0-9]+)?$";
			return src.matches(reg);
		}
		// 判断是否是中国的手机号
		public static boolean isPhone(String src) {
			String reg = "^1[3|4|5|7|8]\\d{9}$";
			return src.matches(reg);

		}
		// 判断是否邮箱
		public static boolean isEMail(String src) {
			String reg = "\\w+\\@\\w+\\.\\w+";
			return src.matches(reg);
		}
	
	
	
	
	
}
