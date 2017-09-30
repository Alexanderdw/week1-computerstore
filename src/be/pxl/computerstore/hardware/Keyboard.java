package be.pxl.computerstore.hardware;

public class Keyboard extends Peripheral{
	
	private String KeyboardLayout;

	
	public String getKeyboardLayout() {
		return KeyboardLayout;
	}


	public void setKeyboardLayout(String keyboardLayout) {
		if(keyboardLayout.equals("AZERTY") || keyboardLayout.equals("QWERTY")){
			KeyboardLayout = keyboardLayout;
		}
		else{
			System.out.println("Foutieve ingave voor Keyboard Layout, "
					+ "enkel AZERTY of QWERTY mogelijk");
		}
	}


	public Keyboard(String vendor, String name, double price, String keyboardLayout) {
		super();
		this.setVendor(vendor);
		this.setName(name);
		this.setPrice(price);
		this.setKeyboardLayout(keyboardLayout);
	}

}
