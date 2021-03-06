package com.awscherb.cardkeeper.util.db

import androidx.room.TypeConverter
import com.google.zxing.BarcodeFormat

object BarcodeConverters {

    @[TypeConverter JvmStatic]
    fun fromString(string: String): BarcodeFormat = BarcodeFormat.valueOf(string)

    @[TypeConverter JvmStatic]
    fun toString(format: BarcodeFormat): String = format.toString()

}