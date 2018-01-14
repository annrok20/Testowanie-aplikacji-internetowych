package pl.lodz.uni.math.seleniumTest;

public class Page {
	
	String page;
	
	public Page()
	{
		page = "http://www.seleniumeasy.com/test/";
	}
	
	public String ReturnWebsite() {
		return page;
	}

}
