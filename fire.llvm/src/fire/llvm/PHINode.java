package fire.llvm;

public class PHINode extends Value {
	private PHINode(long pointerAddress) {
		super(pointerAddress);
	}
	
	public native void addIncoming(Value v, BasicBlock bb);
}