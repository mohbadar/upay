package af.asr.server.infrastructure.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeUtil {

    ZoneId defaultZoneId = ZoneId.systemDefault();

    public LocalDateTime getCurrentDate() {
        Instant instant = (new Date()).toInstant();
        LocalDateTime dateTime = instant.atZone(defaultZoneId).toLocalDateTime();
        return dateTime;
    }

    public LocalDateTime convertStringToLocalDateTime(String dateStr) {
        if(dateStr != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(dateStr, formatter);
            return dateTime;
        }
        return null;
    }

    public LocalDateTime convertDateToLocalDateTime(Date date) {
        if(date != null) {
            Instant instant = date.toInstant();
            LocalDateTime dateTime = instant.atZone(defaultZoneId).toLocalDateTime();
            return dateTime;
        }
        return null;
    }
}
