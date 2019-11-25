package life.avishekworld.kotlinapp.service

import life.avishekworld.kotlinapp.model.User

class LocalUserRepository : IUserRepository {

    companion object {
        val instance = LocalUserRepository()
    }

    override fun getUser(id: Long): User {
        return User(1234, "Test User", "test@gmail.com")
    }
}