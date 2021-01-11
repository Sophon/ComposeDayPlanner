package com.example.dayplanner.ui.dayview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.dayplanner.DayPlannerApp
import com.example.dayplanner.R

private const val DAY_VIEW = "DAY_VIEW"

class DayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day)

        val dayFragment = displayDayFragment(savedInstanceState)

        buildComponents(dayFragment, (application as DayPlannerApp).serviceLocator)
    }

    private fun displayDayFragment(savedInstanceState: Bundle?): Fragment? {
        var fragment = supportFragmentManager.findFragmentByTag(
            DAY_VIEW
        ) as DayView?

        if (fragment == null) {
            fragment = DayView.newInstance()
        }

        if(savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.root_day_view,
                    fragment!!,
                    DAY_VIEW
                )
                .commit()
        }

        return fragment
    }
}