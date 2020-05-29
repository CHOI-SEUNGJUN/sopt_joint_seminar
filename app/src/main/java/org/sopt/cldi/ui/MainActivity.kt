package org.sopt.cldi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sopt.cldi.R
import org.sopt.cldi.ui.gunShop.GunShopFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.gunShopFragment,
                GunShopFragment())
            .commit()
    }
}
