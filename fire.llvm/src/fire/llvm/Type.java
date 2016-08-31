package fire.llvm;

public class Type extends PointerWrapper {
	protected Type(long pointerAddress) {
		super(pointerAddress);
	}
	
	public native PointerType getPointerTo();
}