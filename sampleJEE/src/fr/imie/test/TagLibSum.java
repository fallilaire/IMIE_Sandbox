package fr.imie.test;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagLibSum extends SimpleTagSupport {

	private int firstField = 0;
	private int secondField = 0;
	private int sum = 0;

	public void setFirstField(int value) {
		this.firstField = value;
	}

	public void setSecondField(int secondField) {
		this.secondField = secondField;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public void doTag() throws JspException {
		this.sum = this.firstField + this.secondField;
		try {
			this.getJspContext().getOut().println("Somme : " + this.sum);
		} catch (IOException e) {
			throw new JspException("I/O Error", e);
		}
	}


}
