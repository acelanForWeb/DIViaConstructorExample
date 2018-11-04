package tw.acelan.output.impl;

import tw.acelan.output.IOutputGenerator;

public class CsvOutputGenerator implements IOutputGenerator{

	public void generateOutput() {
		//實作IOutputGeneraotr的generateOutput方法
		//以下假設使用此一實作類別時將輸出Csv格式的輸出
		System.out.println("This is Csv OutputGenerator");
	}

}