import java.util.*;

public class Generated_636767021a6d9265ec0178bf {
    @Override
    protected Object convertToType(final Class<?> type,final Object value) throws Exception {
        if (value == null || "".equals(value.toString())) return null;
        String stringValue = value.toString();
        if (stringValue.length() == 0) return null;
        if (type.equals(String.class)) return stringValue;

        // try to parse as a number
        if (type.equals(Number.class) || type.equals(Integer.class) || type.equals(Long.class)
                || type.equals(Double.class) || type.equals(Float.class)) {
            try {
                Integer.parseInt(stringValue);
                return new Integer(stringValue);
            } catch (NumberFormatException e) {
                try {
                    Long.parseLong(stringValue);
                    return new Long(stringValue);
                } catch (NumberFormatException e1) {
                    try {
                        Double.parseDouble(stringValue);
                        return new Double(stringValue);
                    } catch (NumberFormatException e2) {
                        try {
                            Float.parseFloat(stringValue);
                            return new Float(stringValue);
                        } catch (NumberFormatException e3) {
                            return stringValue;
                        }
                    }
                }
            }
        }

        // try to match with a known enum
        for (Object o : getKnownEnumConstants(type)) {
            if (o.toString().equalsIgnoreCase(stringValue)) return o;
        }

        // try to match with a known primitive wrapper
        for (Object o : getKnownWrapperPrimitiveObjects(type)) {
            if (o.toString().equalsIgnoreCase(stringValue)) return o;
        }

        // try to match with a known primitive
        for (Class c : getKnownWrapperPrimitives()) {
            if (c.isAssignableFrom(type) && c.getSimpleName().equalsIgnoreCase(stringValue)) return c.getConstructor().newInstance();
        }

        // try to match with a known array type
        if (ArrayUtil.isArray(type)) {
            Class componentType = ArrayUtil.getComponentType(type);
            Object arrayValue = Array.newInstance(componentType, 1);
            try {
                Array.set(arrayValue, 0, stringValue);
                return arrayValue;
            } catch (Exception e) {
                throw new IllegalArgumentException("Could not create array of type " + type.getName() + " from value " + stringValue);
            }
        }

        // try to match with a custom converter
        Converter converter = findConverterForType(type);
        if (converter != null) {
            return converter.convert(this, value);
        }

        // try to match with a known collection type
        if (CollectionUtil.isCollection(type)) {
            Collection<Object> collectionValue
}