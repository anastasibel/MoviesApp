package com.dz.moviesapp.presentation.view.moviesDetails

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.dz.moviesapp.R
import com.dz.moviesapp.domain.model.Person

class PersonAdapter : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    private var personsList = listOf<Person>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder_person, parent, false)
        return PersonViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return personsList.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.onBind(personsList[position])
    }

    fun bindPersons(newPersons: List<Person>) {
        personsList = newPersons
    }

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTV: TextView = itemView.findViewById(R.id.name)
        private val imageIV: ImageView = itemView.findViewById(R.id.photo)

        fun onBind(person: Person) {
            nameTV.text = person.name
            imageIV.load(person.photo)
        }
    }
}