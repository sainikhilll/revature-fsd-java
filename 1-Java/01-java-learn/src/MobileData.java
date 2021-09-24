import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MobileData {

	static Mobile mobile1 = new Mobile("Nokia123", 9999.0d, "Windows", "Nokia", 1);
	static Mobile mobile2 = new Mobile("Nokia321", 12500.0d, "Windows", "Nokia", 1);
	static Mobile mobile3 = new Mobile("Oneplus6", 49999.0d, "Andriod", "oneplus", 1);
	static Mobile mobile4 = new Mobile("iphone12", 69999.0d, "ios", "Apple", 0);
	static Mobile mobile5 = new Mobile("iphone13", 99999.0d, "ios", "Apple", 1);

	//static Mobile[] mobilelist = { mobile1, mobile2, mobile3, mobile4, mobile5 };
	static ArrayList<Mobile> mblist = new ArrayList<>();
	public static  void main(String[] args) {
		mblist.add(mobile1);
		mblist.add(mobile2);
		mblist.add(mobile3);
		mblist.add(mobile4);
		mblist.add(mobile5);
		
		}

}