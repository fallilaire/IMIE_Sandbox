package fr.imie.test;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagLibDisplayTable extends SimpleTagSupport {

	private int nbLines;

	public void setNbLines(int nbLines) {
		this.nbLines = nbLines;
	}

	@Override
	public void doTag() throws JspException {
		try {
			String display = "<table border=\"1\">\n";
			for (int i = 0; i < this.nbLines; i++) {
				if (i % 2 == 0) {
					display += greyLine("Ligne " + i);
				} else {
					display += whiteLine("Ligne " + i);
				}
			}
			display += "</table>\n";

			this.getJspContext().getOut().println(display);

		} catch (IOException e) {
			throw new JspException("I/O Error", e);
		}
	}

	private String greyLine(String text) {
		return "<tr bgcolor=\"grey\"><td>" + text + "</td></tr>\n";
	}

	private String whiteLine(String text) {
		return "<tr bgcolor=\"white\"><td>" + text + "</td></tr>\n";
	}

}
