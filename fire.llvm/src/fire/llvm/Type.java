package fire.llvm;

public class Type {
	static {
		System.loadLibrary("fireLLVM");
	}
	
	private final long pointerAddress;
	
	protected Type(long pointerAddress) {
		this.pointerAddress = pointerAddress;
	}
	
	public native PointerType getPointerTo();
}