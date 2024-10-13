package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long =0L,
    @ColumnInfo(name="wish-title")
    val title: String = "",
    @ColumnInfo(name="wish-desc")
    val description: String =""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Android watch 2", description = "An Android watch"),
        Wish(title = "Noise 4", description = "A Dual connectivity headphones"),
        Wish(title = "Apple Airpods", description = "An Ios Bluetooth earphones"),
        Wish(title = "Samsung S24 Ultra", description = "An Android Phone"),
        Wish(title = "Apple Iphone 15", description = "An IoS Phone"),
    )
}
