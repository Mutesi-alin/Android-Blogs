package com.example.blogs


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blogs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBloging.layoutManager = LinearLayoutManager(this)
        displayblogs()

    }
    fun displayblogs(){
        val blog1 = Blog("Cooking","","Can you imagine if you went to your primary care doctors office for cooking classes","","","","","","")
        val blog2 = Blog("Cooking","","Can you imagine if you went to your primary care doctors office for cooking classes","","","","","","")
        val blog3 = Blog("Cooking","","Can you imagine if you went to your primary care doctors office for cooking classes","","","","","","")
        val blog4 = Blog("Cooking","","Can you imagine if you went to your primary care doctors office for cooking classes","","","","","","")
        val myblogs= listOf(blog1,blog2,blog3,blog4)

        var blogsAdapter = BlogReaderAdapter(myblogs)
        binding.rvBloging.adapter = blogsAdapter
    }

}