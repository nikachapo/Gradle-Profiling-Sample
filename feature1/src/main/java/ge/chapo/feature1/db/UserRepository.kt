package ge.chapo.feature1.db

import ge.chapo.feature2.db.User
import ge.chapo.feature2.db.UserDao


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
