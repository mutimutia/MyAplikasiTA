package my.id.mutimutia.myaplikasita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import my.id.mutimutia.myaplikasita.databinding.ActivityMainBinding
import my.id.mutimutia.myaplikasita.fragments.KlienFragment
import my.id.mutimutia.myaplikasita.fragments.BerandaFragment
import my.id.mutimutia.myaplikasita.fragments.LayananFragment
import my.id.mutimutia.myaplikasita.fragments.ProfilFragment


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        replaceFragment(BerandaFragment())
    }

    private fun init() {
        binding.bottomNavigationView.background = null

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.beranda -> replaceFragment(BerandaFragment())
                R.id.klien -> replaceFragment(KlienFragment())
                R.id.profil -> replaceFragment(ProfilFragment())
                R.id.layanan -> replaceFragment(LayananFragment())
            }
            true
        }

        binding.bottomNavigationView.setOnClickListener {
            replaceFragment(BerandaFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}


