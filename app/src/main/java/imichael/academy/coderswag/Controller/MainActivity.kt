package imichael.academy.coderswag.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import imichael.academy.coderswag.Adapters.CategoryAdapter
import imichael.academy.coderswag.R
import imichael.academy.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter


    }
}
