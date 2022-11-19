package com.aytachuseynli.movieapp

import  android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aytachuseynli.movieapp.databinding.CardDesignBinding
import com.google.android.material.snackbar.Snackbar

class MovieAdapter(var mContext: Context, var movieList:List<Movie>)
    : RecyclerView.Adapter<MovieAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var binding: CardDesignBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding = CardDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val movie = movieList.get(position)
        val b = holder.binding

        b.imageViewMovie.setImageResource(
            mContext.resources.getIdentifier(movie.image,"drawable",mContext.packageName))

        b.textViewPrice.text = "${movie.price} $"

        b.buttonAddToCart.setOnClickListener{
            Snackbar.make(it, "${movie.image} is added to cart", Snackbar.LENGTH_LONG).show()
        }

    }

    override fun getItemCount(): Int {
    return movieList.size
    }
}