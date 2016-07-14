package cn.itcast.pingyin.demo;

import org.junit.Test;

import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;

public class PingyinTest {
	@Test
	public void testPingyin() {
		String str = "你好世界,重庆,方便面便宜啊";
	    String str1 = PinyinHelper.convertToPinyinString(str, ",", PinyinFormat.WITH_TONE_MARK); // nǐ,hǎo,shì,jiè
	    String str2 = PinyinHelper.convertToPinyinString(str, ",", PinyinFormat.WITH_TONE_NUMBER); // ni3,hao3,shi4,jie4
	    String str3 =  PinyinHelper.convertToPinyinString(str, ",", PinyinFormat.WITHOUT_TONE); // ni,hao,shi,jie
	    String str4 = PinyinHelper.getShortPinyin(str);
	    
	    System.out.println(str1);
	    System.out.println(str2);
	    System.out.println(str3);
	    System.out.println(str4);
	}
}
