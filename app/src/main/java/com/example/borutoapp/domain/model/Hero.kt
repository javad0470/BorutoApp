package com.example.borutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.borutoapp.util.Constants.HERO_DATABASE_TABLE
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = HERO_DATABASE_TABLE)
data class Hero(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    var name: String,
    var image: String,
    var about: String,
    var rating: Double,
    var power: Int,
    var month: String,
    var day: String,
    var family: List<String>,
    var abilities: List<String>,
    var natureTypes: List<String>,
)
