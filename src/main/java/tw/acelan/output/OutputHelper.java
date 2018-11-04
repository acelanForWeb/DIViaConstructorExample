package tw.acelan.output;

public class OutputHelper {
	private IOutputGenerator outputGenerator;

	//Spring �N�|�z�L�غc�l�N��@���O�i��`�J
	//�]�N�O���d�Ҫ�DI via constructor���D��
	public OutputHelper(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}

	public void generateOutput(){
		//outputGenerator��generateOutput��k�|�̷Ө��@���O���P�Ӥ��P
		outputGenerator.generateOutput();
	}
}
