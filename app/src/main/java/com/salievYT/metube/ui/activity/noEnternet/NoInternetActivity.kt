package com.salievYT.metube.ui.activity.noEnternet

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import com.myself223.metube.R
import com.myself223.metube.databinding.ActivityNoInternetBinding
import com.salievYT.metube.ui.activity.MainActivity
import com.salievYT.metube.ui.other.isNetworkAvailable
import com.salievYT.metube.ui.other.maceT
import com.salievYT.metube.ui.other.mainIntent

class NoInternetActivity : AppCompatActivity() {
    private val binding : ActivityNoInternetBinding by lazy {
        ActivityNoInternetBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btn.setOnClickListener {
            if (!isNetworkAvailable(this)) {
               maceT("Все еще нет интеренета")
            }else{
                mainIntent(MainActivity())
            }
        }
    }
}