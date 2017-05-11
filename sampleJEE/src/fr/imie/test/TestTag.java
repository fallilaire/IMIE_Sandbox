package fr.imie.test;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TestTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		try {
			this.getJspContext().getOut().println("Hello World !");
		} catch (IOException e) {
			throw new JspException("I/O Error", e);
		}
	}

}
