package ge.tbcbank.gradleoptimisationsample.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ge.tbcbank.feature1.db.User
import ge.tbcbank.feature1.db.UserDao

@Database(
    entities = [
        User::class,
        ge.tbcbank.feature2.db.User::class,
        ge.tbcbank.feature3.db.User::class,
    ], version = 1, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun userDao2(): ge.tbcbank.feature2.db.UserDao
    abstract fun userDao3(): ge.tbcbank.feature3.db.UserDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
