package life.avishekworld.kotlinapp.service

import life.avishekworld.kotlinapp.model.Note


class LocalNoteRepository : INoteRepository {

    var note = Note("Kotlin", "Kotlin is a functional Programming Language", "1234")

    companion object {
        val instance = LocalNoteRepository()
    }

    override fun getNote(id: String): Note {
        return note
    }

    override fun saveNote(note: Note) {
        this.note = note
    }


}