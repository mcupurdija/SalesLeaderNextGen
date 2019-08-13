package com.intelisale.database.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import timber.log.Timber;

public class DateUtils {

    private static DateTimeFormatter wsDateTimeFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss");

    public static DateTime parseDateTime(String date, boolean ignoreYear) {
        try {
            DateTime dateTime = wsDateTimeFormat.parseDateTime(date);
            if (ignoreYear || dateTime.getYear() > 1900) {
                return dateTime;
            }
        } catch (UnsupportedOperationException e) {
            Timber.e("parseDateTime: parsing is not supported");
        } catch (IllegalArgumentException e) {
            Timber.e("parseDateTime: text to parse is invalid");
        } catch (Exception e) {
            Timber.e("parseDateTime: other exception");
        }
        return null;
    }

    public static String formatDateTime(DateTime dateTime) {
        return dateTime != null ? wsDateTimeFormat.print(dateTime) : null;
    }
}