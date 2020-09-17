package co.tiagoaguiar.clone.googleplay.view

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import co.tiagoaguiar.clone.googleplay.R

class MainActivity : FragmentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    if (savedInstanceState == null) {
      supportFragmentManager.beginTransaction()
        .add(R.id.container, MainFragment())
        .commitNow()
    }
  }

}