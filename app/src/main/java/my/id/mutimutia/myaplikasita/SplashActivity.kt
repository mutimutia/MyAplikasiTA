package my.id.mutimutia.myaplikasita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import my.id.mutimutia.myaplikasita.databinding.ActivitySplashBinding

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        afterDelayGoToLogin()
    }

    private fun afterDelayGoToLogin() {
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, 2500)
    }


}