package fr.imie.test;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagLibNombrePremier extends SimpleTagSupport {

	private int nbLines;

	public void setNbLines(int nbLines) {
		this.nbLines = nbLines;
	}

	@Override
	public void doTag() throws JspException {
		try {
			String display = "<table border=\"1\">\n";

			if (this.nbLines <= 2) {
				display += "<tr><td>Le nombre doit être supérieur à 2</td></tr>";
			}

			for (int i = 2; i < this.nbLines; i++) {
				if (i % 2 == 0) {
					display += createLine(i, "grey");
				} else {
					display += createLine(i, "white");
				}
			}
			display += "</table>\n";

			this.getJspContext().getOut().println(display);

		} catch (IOException e) {
			throw new JspException("I/O Error", e);
		}
	}

	private String createLine(int i, String color) {
		String display;
		if (isPremier(i)) {
			display = i + " est un nombre premier";
		} else {
			display = i + " n'est pas un nombre premier";
		}
		return "<tr bgcolor=\"" + color + "\"><td>Ligne " + i + "</td><td>" + display + "</td></tr>\n";
	}

	private boolean isPremier(int n) {
		boolean isPremier = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n != i && n % i == 0) {
				isPremier = false;
				break;
			}
		}
		return isPremier;
	}

}
