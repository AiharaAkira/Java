package com.fin.gui;

import java.math.BigDecimal;

public class CalVO {

	private BigDecimal c_no;
	private String c_income_type;
	private BigDecimal c_income_ammount;
	private String c_income_memo;
	private String c_expense_type;
	private BigDecimal c_expense_ammount;
	private String c_expense_memo;
	
	public CalVO() {
	}

	public BigDecimal getC_no() {
		return c_no;
	}

	public void setC_income_ammount(BigDecimal c_income_ammount) {
		this.c_income_ammount = c_income_ammount;
	}

	public void setC_no(BigDecimal c_no) {
		this.c_no = c_no;
	}

	public String getC_income_type() {
		return c_income_type;
	}

	public void setC_income_type(String c_income_type) {
		this.c_income_type = c_income_type;
	}

	public BigDecimal getC_income_ammount() {
		return c_income_ammount;
	}

	public void expense(BigDecimal c_income_ammount) {
		this.c_income_ammount = c_income_ammount;
	}

	public String getC_income_memo() {
		return c_income_memo;
	}

	public void setC_income_memo(String c_income_memo) {
		this.c_income_memo = c_income_memo;
	}

	public String getC_expense_type() {
		return c_expense_type;
	}

	public void setC_expense_type(String c_expense_type) {
		this.c_expense_type = c_expense_type;
	}

	public BigDecimal getC_expense_ammount() {
		return c_expense_ammount;
	}

	public void setC_expense_ammount(BigDecimal c_expense_ammount) {
		this.c_expense_ammount = c_expense_ammount;
	}

	public String getC_expense_memo() {
		return c_expense_memo;
	}

	public void setC_expense_memo(String c_expense_memo) {
		this.c_expense_memo = c_expense_memo;
	}

	public CalVO(BigDecimal c_no, String c_income_type, BigDecimal c_income_ammount, String c_income_memo,
			String c_expense_type, BigDecimal c_expense_ammount, String c_expense_memo) {
		super();
		this.c_no = c_no;
		this.c_income_type = c_income_type;
		this.c_income_ammount = c_income_ammount;
		this.c_income_memo = c_income_memo;
		this.c_expense_type = c_expense_type;
		this.c_expense_ammount = c_expense_ammount;
		this.c_expense_memo = c_expense_memo;
	}
	
	
	
}
