package AdapterPattern;

public class XpayToPayDAdapter implements PayD {
	private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer CVVNo;
    private Double totalAmount;
    
    private final Xpay xpay;

    public XpayToPayDAdapter(Xpay xpay) {
    	this.xpay = xpay;
    	setProp();
    }

	public String getCustCardNo() {
		return custCardNo;
	}

	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}

	public String getCardOwnerName() {
		return cardOwnerName;
	}

	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}

	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}

	public Integer getCVVNo() {
		return CVVNo;
	}

	public void setCVVNo(Integer cVVNo) {
		this.CVVNo = cVVNo;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	private void setProp() {
		setCardOwnerName(this.xpay.getCustomerName());
		setCustCardNo(this.xpay.getCreditCardNo());
		setCardExpMonthDate(this.xpay.getCardExpMonth()+"/"+this.xpay.getCardExpYear());
		setCVVNo(this.xpay.getCardCVVNo().intValue());
		setTotalAmount(this.xpay.getAmount());
	}
}
