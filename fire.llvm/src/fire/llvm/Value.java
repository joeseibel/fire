package fire.llvm;

public class Value {
	static {
		System.loadLibrary("fireLLVM");
	}
	
	private final long pointerAddress;
	
	protected Value(long pointerAddress) {
		this.pointerAddress = pointerAddress;
	}
}