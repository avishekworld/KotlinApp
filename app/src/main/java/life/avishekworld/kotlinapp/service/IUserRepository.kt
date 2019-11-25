package life.avishekworld.kotlinapp.service

import life.avishekworld.kotlinapp.model.User

interface IUserRepository {
    fun getUser(id:Long) : User
}