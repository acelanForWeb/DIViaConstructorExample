package tw.acelan.output;

public class OutputHelper {
	private IOutputGenerator outputGenerator;

	//Spring 將會透過建構子將實作類別進行注入
	//也就是本範例的DI via constructor的主角
	public OutputHelper(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}

	public void generateOutput(){
		//outputGenerator的generateOutput方法會依照其實作類別不同而不同
		outputGenerator.generateOutput();
	}
}
