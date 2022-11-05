package pojo;

public class Post {
	String mAbout;
	String mArea;
	String mName;
	int mPin;
	int mid;
	public Post(String mAbout, String mArea, String mName, int mPin, int mid) {
		super();
		this.mAbout = mAbout;
		this.mArea = mArea;
		this.mName = mName;
		this.mPin = mPin;
		this.mid = mid;
	}
	public String getmAbout() {
		return mAbout;
	}
	public void setmAbout(String mAbout) {
		this.mAbout = mAbout;
	}
	public String getmArea() {
		return mArea;
	}
	public void setmArea(String mArea) {
		this.mArea = mArea;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public int getmPin() {
		return mPin;
	}
	public void setmPin(int mPin) {
		this.mPin = mPin;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	
	

}
