package unisigma.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.convert.DateTimeConverter;
import javax.faces.convert.FacesConverter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

@FacesConverter("unisigma.util.XMLGregorianCalConverter")
@ManagedBean
public class XMLGregorianCalConverter extends DateTimeConverter {
 private static final TimeZone DEFAULT_TIME_ZONE = TimeZone.getTimeZone("GMT");
 private String dateStyle = "default";
 private Locale locale = null;
 private String pattern = null;
 private String timeStyle = "default";
 private TimeZone timeZone = DEFAULT_TIME_ZONE;
 private String type = "date";

@Override
public Object getAsObject(FacesContext context, UIComponent component, String newValue) {
	String date = newValue;
    System.out.println("valor de newValue " + newValue);
    XMLGregorianCalendar xmlGregorianCalendar = null;
    try {
//    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy",Locale.ENGLISH);
    	DateFormat dF = DateFormat.getDateInstance(DateFormat.SHORT);
    	Date theDate = dF.parse(date);//formatter.parse(date);
    	GregorianCalendar cal = new GregorianCalendar();
    	System.out.println("Valor de Data " + theDate);
    	cal.setTime(theDate);
        xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
       System.out.println("EJECUTANDO getAsObject " + xmlGregorianCalendar.toString());
    } catch (DatatypeConfigurationException e) {
        FacesMessage message = new FacesMessage("XMLGregorianCalender conversion error.");
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ConverterException(message);
    } catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    return xmlGregorianCalendar;
}

@Override
public String getAsString(FacesContext context, UIComponent component, Object value) {
    /*Map<String, Object> attributes = component.getAttributes();
    if(attributes.containsKey("pattern")){
        pattern = (String) attributes.get("pattern");
    }
    setPattern(pattern);
    if(attributes.containsKey("locale")){
        locale = (Locale) attributes.get("locale");
    }
    setLocale(locale);
    if(attributes.containsKey("timeZone")){
        timeZone = (TimeZone) attributes.get("timeZone");
    }
    setTimeZone(timeZone);
    if(attributes.containsKey("dateStyle")){
        dateStyle = (String) attributes.get("dateStyle");
    }
    setDateStyle(dateStyle);
    if(attributes.containsKey("timeStyle")){
        timeStyle = (String) attributes.get("timeStyle");
    }
    setTimeStyle(timeStyle);
    if(attributes.containsKey("type")){
        type = (String) attributes.get("type");
    }
    setType(type);
*/
	String vReturn;
	
    XMLGregorianCalendar xmlGregCal = (XMLGregorianCalendar) value;
    Date date = xmlGregCal.toGregorianCalendar().getTime();
    vReturn = new SimpleDateFormat("dd/mm/yyyy").format(date);
    System.out.println( "**** aja " + vReturn);
//    return super.getAsString(context, component, date);
    return vReturn;
}

}