package liujianyongweek2_0427.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	
	//�����ر����������ܴ����޸�
	public static void closeAll(AutoCloseable ... autoCloseable){
		if(autoCloseable==null ||autoCloseable.length==0 )
			throw new RuntimeException("�����쳣");
		for (AutoCloseable a : autoCloseable) {
			try {
				a.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/*
	* ����2������һ���ı��ļ�����Ĭ��ΪUTF-8���룬���ظ��ļ�����(3��)��Ҫ�󷽷��ڲ����������1�������ر���(3��)
	*/
	public static String readTextFile(InputStream src){
		//����BufferedReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(src));
	    String  str=null;
	    StringBuffer sb = new StringBuffer();
		try {
			while((str=reader.readLine())!=null) {
				sb.append(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			closeAll(reader);//����
		}
		
		return sb.toString();
		}
	//�����ı��ļ����󣬷��ظ��ļ�����
	public static String readTextFile(File txtFile) {
		
		try {
			FileInputStream stream = new FileInputStream(txtFile);
			return readTextFile(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

		//��ȡ�ļ�������
		public static List<String> readTextFile2List(File txtFile){
			
			List<String> list = new ArrayList<String>();
			//����BufferedReader
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(txtFile)));
		       String str=null;
				while ((str=reader.readLine())!=null) {
					list.add(str);
			}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return list;
		}
	
}
