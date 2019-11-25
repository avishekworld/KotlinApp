package life.avishekworld.kotlinapp.viewmodel

import android.arch.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import life.avishekworld.kotlinapp.model.User
import life.avishekworld.kotlinapp.service.LocalUserRepository

class UserViewModel : ViewModel() {

    var userRepository = LocalUserRepository.instance

    suspend fun getUser(id : Long) : User = withContext(Dispatchers.IO){
        userRepository.getUser(id)
    }
}