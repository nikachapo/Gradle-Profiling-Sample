package ge.tbcbank.feature3.db

import androidx.room.*

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)

    @Query("SELECT * FROM users3")
    fun getAllUsers(): List<User>
}
