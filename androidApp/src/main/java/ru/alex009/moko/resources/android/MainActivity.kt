package ru.alex009.moko.resources.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.alex009.moko.resources.android.databinding.ActivityMainBinding
import ru.alex009.moko.resources.shared.SharedData


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.greetingText.text = SharedData.greeting.toString(this)
    }
}
