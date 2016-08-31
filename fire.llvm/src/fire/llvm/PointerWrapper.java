package fire.llvm;

abstract class PointerWrapper {
	static {
		System.loadLibrary("fireLLVM");
	}
	
	@SuppressWarnings("unused")
	//Read from native code.
	private final long pointerAddress;
	
	protected PointerWrapper(long pointerAddress) {
		this.pointerAddress = pointerAddress;
	}
}