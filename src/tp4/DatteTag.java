package tp4;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.time.*;
import java.io.IOException;
import java.sql.Date;
import java.text.*;

public class DatteTag extends SimpleTagSupport {
	private LocalDate dat;
	private String pattern;

	public void doTag() throws JspException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		JspWriter out = getJspContext().getOut();
		
		String st = simpleDateFormat.format(Date.valueOf(this.dat));
		try {
			out.println(st);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public LocalDate getDat() {
		return dat;
	}

	public void setDat(LocalDate dat) {
		this.dat = dat;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	
}
