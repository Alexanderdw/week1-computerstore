package be.pxl.computerstore.hardware;

import java.util.Random;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase {

	private String vendor;
	private String name;
	private double price;
	private Dimension dimension;
	private double weight;
	private String articleNumber;
	
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

	public ComputerCase(String vendor, String name, double price){
		this.vendor = vendor;
		this.name = name;
		this.price = price;
		setArticleNumber();
		
	}
	
	@Override
	public String toString(){
		return "ArticleNumber = "+articleNumber + "\n" + "Vendor = " 
				+ vendor +"\n"+ "Name = "+ name + "\n Price = "
				+ price + "\n Width = " + dimension.getWidth()
				+ "mm \n Height = " + dimension.getHeight() +"mm \n Depth = "
				+ dimension.getDepth() + "mm \n Weight = " + weight+"kg";
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
	public Dimension getDimension() {
		return dimension;
	}
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
