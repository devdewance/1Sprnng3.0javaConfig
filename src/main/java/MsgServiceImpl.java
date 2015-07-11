
public class MsgServiceImpl implements Msgservice {

	@Override
	public String sayHell(String s) {
		
		return "HELLO "+s;
	}

	@Override
	public boolean msgAcknowledge() {
		// TODO Auto-generated method stub
		System.out.println("succes !!!!");
		return true;
	}

}
