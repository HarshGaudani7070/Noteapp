package com.example.noteapp.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NoteEntity(
    @ColumnInfo(name = "title")  var title: String,
    @ColumnInfo(name = "text")  var text:String,
    @ColumnInfo(name = "date")  var date:String,

    ){
    @PrimaryKey(autoGenerate = true) var id:Int = 0
}