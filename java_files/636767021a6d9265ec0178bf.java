import java.util.*;

public class Generated_636767021a6d9265ec0178bf {
    public Object convertToType(final Class<?> type, final Object value) throws Exception {
        if (value == null || "".equals(value)) {
            return defaultValue;
        }
        if (type.isAssignableFrom(String.class)) {
            return value.toString();
        } else if (type.isAssignableFrom(Boolean.class)) {
            return Boolean.parseBoolean(value.toString());
        } else if (type.isAssignableFrom(Integer.class)) {
            return Integer.parseInt(value.toString());
        } else if (type.isAssignableFrom(Long.class)) {
            return Long.parseLong(value.toString());
        } else if (type.isAssignableFrom(Float.class)) {
            return Float.parseFloat(value.toString());
        } else if (type.isAssignableFrom(Double.class)) {
            return Double.parseDouble(value.toString());
        } else if (type.isAssignableFrom(Date.class)) {
            return DateUtil.parseDate(value.toString(), format);
        } else if (type.isAssignableFrom(Calendar.class)) {
            return CalendarUtil.parseCalendar(value.toString(), format);
        } else if (type.isAssignableFrom(Time.class)) {
            return TimeUtil.parseTime(value.toString(), format);
        } else if (type.isAssignableFrom(Short.class)) {
            return Short.parseShort(value.toString());
        } else if (type.isAssignableFrom(Byte.class)) {
            return Byte.parseByte(value.toString());
        } else if (type.isAssignableFrom(BigInteger.class)) {
            return BigInteger.valueOf(Long.parseLong(value.toString()));
        } else if (type.isAssignableFrom(BigDecimal.class)) {
            return new BigDecimal(value.toString());
        } else if (type.isAssignableFrom(Duration.class)) {
            return Duration.parseDuration(value.toString(), format);
        } else if (type.isAssignableFrom(LocalTime.class)) {
            return LocalTime.parseLocalTime(value.toString(), format);
        } else if (type.isAssignableFrom(LocalDateTime.class)) {
            return LocalDateTime.parseLocalDateTime(value.toString(), format);
        } else if (type.isAssignableFrom(LocalDate.class)) {
            return LocalDate.parseLocalDate(value.toString(), format);
        } else if (type.isAssignableFrom(ZonedDateTime.class)) {
            return ZonedDateTime.parseZonedDateTime(value.toString(), format);
        } else if (type.isAssignableFrom(LocalInstant.class)) {
            return LocalInstant.parseLocalInstant(value.toString(), format);
        } else if (type.isAssignableFrom(LocalEpoch.class)) {
            return LocalEpoch.parseLocalEpoch(value.toString(), format);
        } else if (type.isAssignableFrom(LocalEPOCH.class)) {
            return LocalEPOCH.parseLocalEpoch(value.toString(), format);
        } else if (type.isAssignableFrom(LocalEPOCH2.class)) {
            return LocalEPOCH
}