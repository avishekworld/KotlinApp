package life.avishekworld.kotlinapp.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import life.avishekworld.kotlinapp.model.Note
import life.avishekworld.kotlinapp.viewmodel.NoteViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import life.avishekworld.kotlinapp.R
import life.avishekworld.kotlinapp.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var userViewModel: UserViewModel
    private lateinit var noteViewModel: NoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
        noteViewModel = ViewModelProviders.of(this).get(NoteViewModel::class.java)

        noteViewModel.note.observe(this, Observer{
            title_text_view.setText(it?.title)
            details_text_view.setText(it?.details)
            id_text_view.setText(it?.id)
        })

        loadUser(123)
    }

    private fun loadUser(id : Long){
        GlobalScope.launch{
            val user = userViewModel.getUser(id)
        }
    }

    override fun onPause() {
        val note: Note = Note().apply {
            title = title_text_view.text.toString()
            details = details_text_view.text.toString()
            id = id_text_view.text.toString()
        }
        noteViewModel.saveNote(note)
        super.onPause()
    }
}
