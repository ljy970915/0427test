package liujianyongweek2_0427.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZHStringUtilTest {

	@Test
	void test() {
		String zhName = ZHStringUtil.getZHName();
		
		System.out.println(zhName);
	}

}
