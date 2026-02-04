package parkingLotSystem;

public interface Payment_Strategy {
	
	public boolean pay(String ticket, int amount);
}
