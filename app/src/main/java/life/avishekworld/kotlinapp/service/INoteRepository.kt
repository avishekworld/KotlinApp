package life.avishekworld.kotlinapp.service

import life.avishekworld.kotlinapp.model.Note

interface INoteRepository {
    fun getNote(id:String) : Note
    fun saveNote(note: Note)
}