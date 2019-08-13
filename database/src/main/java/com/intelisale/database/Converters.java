package com.intelisale.database;

import androidx.room.TypeConverter;

import com.intelisale.database.utils.DateUtils;

import org.joda.time.DateTime;

public class Converters {

    @TypeConverter
    public static DateTime parseDateTime(String value) {
        return DateUtils.parseDateTime(value, false);
    }

    @TypeConverter
    public static String formatDateTime(DateTime dateTime) {
        return DateUtils.formatDateTime(dateTime);
    }
}