package ge.tbcbank.feature2.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users2")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val email: String
)
