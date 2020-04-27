package liujianyongweek2_0427.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandNumUtilTest {

	@Test
	void test() {
		double d = RandNumUtil.getValue(30000.0, 80000.0, 2);
		System.out.println(d);
	}

}
