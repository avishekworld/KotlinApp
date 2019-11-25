package life.avishekworld.kotlinapp.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import life.avishekworld.kotlinapp.model.Note
import life.avishekworld.kotlinapp.service.INoteRepository
import life.avishekworld.kotlinapp.service.LocalNoteRepository


class NoteViewModel : ViewModel() {

    private val noteRepository: INoteRepository = LocalNoteRepository.instance

    val note: LiveData<Note>
    init {
        note = getNote("1234")
    }

    private fun getNote(id:String) : LiveData<Note>{
        val note: Note = noteRepository.getNote(id)
        return MutableLiveData<Note>().apply { postValue(note) }
    }

    fun saveNote(note: Note){
        noteRepository.saveNote(note)
    }
}