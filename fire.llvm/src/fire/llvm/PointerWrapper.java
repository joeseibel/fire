package fire.llvm;

abstract class PointerWrapper {
	static {
		System.loadLibrary("fireLLVM");
	}
	
	@SuppressWarnings("unused")
	//Read from native code.
	private final long pointerAddress;
	
	protected PointerWrapper(long pointerAddress) {
		if (pointerAddress == 0) {
			throw new IllegalArgumentException("pointerAddress cannot be 0");
		}
		this.pointerAddress = pointerAddress;
	}
}