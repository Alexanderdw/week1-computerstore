package be.pxl.computerstore.hardware;

import java.util.Random;

public class Processor {

	private String vendor;
	private String name;
	private double price;
	private double clockSpeed;
	private String articleNumber;
	
	public Processor(String vendor, String name, double price, double clockSpeed) {
		super();
		this.vendor = vendor;
		this.name = name;
		this.price = price;
		setArticleNumber();
		
		if(clockSpeed >= 0.7){
			this.clockSpeed = clockSpeed;
		}else {
			System.out.println("Foutieve ingave voor ClockSpeed, automatisch aangepast naar 0.7 GHz!");
			this.clockSpeed = 0.7;
		}
		
	}
	
	@Override
	public String toString(){
		return "ArticleNumber = "+articleNumber + "\n" + "Vendor = " 
				+ vendor +"\n"+ "Name = "+ name + "\n Price = "
				+ price + "\n Clock speed = "+ clockSpeed+"GHz";
	}
	
	public String getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber() {
		
		StringBuilder sb = new StringBuilder();
		if(vendor.length() >= 3){
			sb.append(vendor);
		}else {
			sb.append(vendor);
			sb.append("X");
		}
		sb.append("-");
		
		Random r = new Random();
		int code1 = r.nextInt((99999-10000) + 1) + 10000;
		sb.append(code1);
		sb.append("-");
		int code2 = r.nextInt((999-100) + 1) + 100;
		if(String.valueOf(code2).contains("0")){
			sb.append("123");
		}else {
			sb.append(code2);
		}
		this.articleNumber = sb.toString();;
	}
	
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getClockspeed() {
		return clockSpeed;
	}
	public void setClockspeed(double clockSpeed) {
		if(clockSpeed >= 0.7){
			this.clockSpeed = clockSpeed;
		} else {
			System.out.println("Foutieve ingave voor Clockspeed, automatisch aangepast naar 0.7!");
			this.clockSpeed = 0.7;
		}
		
	}
	
	
}
