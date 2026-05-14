import java.util.*;

public class Generated_636767021a6d9265ec0178bf {
    @Override
	protected Object convertToType(final Class<?> type,
			final Object value)
		throws Exception {
		
		if(value == null || "".equals(value)) {
			
			return this.getDefaultValue(type);
		}
		
		String stringValue = String.valueOf(value);

		if (type.equals(String.class)) {
			return stringValue;
		} else if (type.equals(Integer.class) || type.equals(int.class)) {
			int intValue = Integer.parseInt(stringValue);
			return new Integer(intValue);
		} else if (type.equals(Long.class) || type.equals(long.class)) {
			long longValue = Long.parseLong(stringValue);
			return new Long(longValue);
		} else if (type.equals(Float.class) || type.equals(float.class)) {
			float floatValue = Float.parseFloat(stringValue);
			return new Float(floatValue);
		} else if (type.equals(Double.class) || type.equals(double.class)) {
			double doubleValue = Double.parseDouble(stringValue);
			return new Double(doubleValue);
		} else if (type.equals(Boolean.class) || type.equals(boolean.class)) {
			boolean booleanValue = Boolean.parseBoolean(stringValue);
			return new Boolean(booleanValue);
		} else if (type.equals(Byte.class) || type.equals(byte.class)) {
			byte byteValue = Byte.parseByte(stringValue);
			return new Byte(byteValue);
		} else if (type.equals(Short.class) || type.equals(short.class)) {
			short shortValue = Short.parseShort(stringValue);
			return new Short(shortValue);
		} else if (type.equals(Character.class) || type.equals(char.class)) {
			char charValue = stringValue.charAt(0);
			return new Character(charValue);
		} else if (type.equals(Date.class)) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date dateValue = sdf.parse(stringValue);
			return dateValue;
		}

		throw new IllegalArgumentException(
				"Could not convert " + value.getClass().getName()
						+ " to " + type.getName());
	}
}