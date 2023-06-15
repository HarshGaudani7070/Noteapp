package com.example.noteapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noteapp.Entity.NoteEntity
import com.example.noteapp.R
import com.example.noteapp.databinding.NoteItemBinding

class NoteAdapter {

    lateinit var  note : List<NoteEntity>

    class NotesHolder(itemView: NoteItemBinding) : RecyclerView.ViewHolder(itemView.root){

        var binding = itemView

    }

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesHolder {
        var  binding = NoteItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NotesHolder(binding)
    }

    fun getItemCount(): Int {
        return note.size
    }

    fun onBindViewHolder(holder: NotesHolder, position: Int) {

        holder.binding.apply {
            note.get(position).apply {
                titlent.text =  title
                textnt.text = text

            }
        }

    }

    fun update(note: List<NoteEntity>){
        this.note = note
    }
}