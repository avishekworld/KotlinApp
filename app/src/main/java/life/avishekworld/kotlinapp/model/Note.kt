package life.avishekworld.kotlinapp.model


data class Note(var title:String?, var details:String?, var id:String?) {
    constructor() : this(null, null, null)
}