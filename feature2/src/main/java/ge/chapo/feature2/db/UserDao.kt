package ge.chapo.feature2.db

import androidx.room.*
import ge.chapo.feature2.db.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)

    @Query("SELECT * FROM users2")
    fun getAllUsers(): List<User>
}
