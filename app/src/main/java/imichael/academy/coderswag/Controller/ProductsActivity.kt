package imichael.academy.coderswag.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import imichael.academy.coderswag.R
import imichael.academy.coderswag.utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val productIntent = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
