package duomi.com.httpIvk.param.phone;

import duomi.com.httpIvk.param.BaseRequest;

public class MobileHaltInput extends BaseRequest {
	public String name;
	public String mobile;
	public String idCard;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
}
