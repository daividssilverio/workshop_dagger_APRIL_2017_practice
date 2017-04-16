package br.com.test.kotlindaggerhell.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import br.com.test.kotlindaggerhell.R

class DashboardActivity : AppCompatActivity(), View {

    lateinit private var dashboardComponent: DashboardComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dashboardComponent = getWorkshopApp().getComponentBuilder(DashboardComponent.Builder::class).get()
                .provideView(this)
                .build()

        Toast.makeText(this, Integer.toHexString(dashboardComponent.hashCode()), Toast.LENGTH_LONG).show()
    }

    fun getWorkshopApp() = application as WorkshopApp
}
