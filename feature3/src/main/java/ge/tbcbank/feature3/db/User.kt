package ge.tbcbank.feature3.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users3")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val email: String
)
