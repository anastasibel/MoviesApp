package com.dz.moviesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ActorAdapter : RecyclerView.Adapter<ActorAdapter.ActorViewHolder>() {

    private var actorsList = listOf<Actor>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder_actor, parent, false)
        return ActorViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return actorsList.size
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        holder.onBind(actorsList[position])
    }

    fun bindActors(newActors: List<Actor>) {
        actorsList = newActors
    }

    class ActorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTV: TextView = itemView.findViewById(R.id.name)
        private val imageIV: ImageView = itemView.findViewById(R.id.photo)

        fun onBind(actor: Actor) {
            nameTV.setText(actor.nameId)
            imageIV.setImageResource(actor.imageId)
        }
    }
}