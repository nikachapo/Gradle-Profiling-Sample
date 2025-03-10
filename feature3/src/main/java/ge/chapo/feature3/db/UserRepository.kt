package ge.chapo.feature3.db


class UserRepository(private val userDao: UserDao) {

    suspend fun insertUser(user: User) {
        userDao.insertUser(user)
    }

    suspend fun getAllUsers(): List<User> {
        return userDao.getAllUsers()
    }

    suspend fun deleteUser(userId: Int) {
    }
}
