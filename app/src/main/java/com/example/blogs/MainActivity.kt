package com.example.blogs


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager

import com.example.blogs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBloging.layoutManager = LinearLayoutManager(this)
        displayBlogs()
    }

    fun displayBlogs(){
        var blog1= Blogs("James hoffman","Home made coffe","author image","Description" +
                "Coffe has been my long, prepare, and enjoy coffee, creating a more sustainable and equitable  ","Read More","World Altas Coffee","2024")

        var blog2= Blogs("James hoffman","Home made coffe","author image","Description" +
                "Coffe has been my long, prepare, and enjoy coffee, creating a more sustainable and equitable  ","Read More","World Altas Coffee","2024")

        var blog3= Blogs("James hoffman","Home made coffe","author image","Description" +
                "Coffe has been my long, prepare, and enjoy coffee, creating a more sustainable and equitable  ","Read More","World Altas Coffee","2024")

        var blog4= Blogs("James hoffman","Home made coffe","author image","Description" +
                "Coffe has been my long, prepare, and enjoy coffee, creating a more sustainable and equitable  ","Read More","World Altas Coffee","2024")

        var blog5= Blogs("James hoffman","Home made coffe","author image","Description" +
                "Coffe has been my long, prepare, and enjoy coffee, creating a more sustainable and equitable  ","Read More","World Altas Coffee","2024")

        var blog6= Blogs("James hoffman","Home made coffe","author image","Description" +
                "Coffe has been my long, prepare, and enjoy coffee, creating a more sustainable and equitable  ","Read More","World Altas Coffee","2024")


       var Novels= listOf(blog6,blog5,blog1,blog2,blog3,blog4)
        val novolesAdapter=BlogAdapter(Novels)
        binding.rvBloging.adapter=novolesAdapter
    }
    }



