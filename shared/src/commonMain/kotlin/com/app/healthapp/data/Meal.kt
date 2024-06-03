package com.app.healthapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Meal(
    @PrimaryKey val id: Int,
    val name: String,
)