package com.aytachuseynli.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.aytachuseynli.movieapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val movieList = ArrayList<Movie>()
        val f1 = Movie(1,"anadoluda",10)
        val f2 = Movie(2,"django",10)
        val f3 = Movie(3,"inception",10)
        val f4 = Movie(4,"interstellar",10)
        val f5 = Movie(5,"thehatefuleight",10)
        val f6 = Movie(6,"thepianist",10)
        movieList.add(f1)
        movieList.add(f2)
        movieList.add(f3)
        movieList.add(f4)
        movieList.add(f5)
        movieList.add(f6)

        val adapter = MovieAdapter(this, movieList)

        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        binding.rv.adapter = adapter
    }
}