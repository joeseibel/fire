package fire;

import org.eclipse.xtext.xbase.lib.StringExtensions;

public enum FireType {
	STRING, BOOLEAN, INTEGER, REAL;
	
	@Override
	public String toString() {
		return StringExtensions.toFirstUpper(name().toLowerCase());
	}
}