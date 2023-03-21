package com.example.home_pharmacy.db

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "medicines")
data class Medicine(
    @PrimaryKey
    @ColumnInfo(name="uuid")
    val uuid: String,

    @ColumnInfo(name="type")
    val type: String,

    @ColumnInfo(name="name")
    val name: String,

    @ColumnInfo(name="expires")
    val expires: String,

    @ColumnInfo(name="tags")
    val tags: String,

    ) : Parcelable
