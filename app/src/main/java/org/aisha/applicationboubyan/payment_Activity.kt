package org.aisha.applicationboubyan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_payment_.*

class payment_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_)



        toolbarPayment.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)

        toolbarPayment.setNavigationOnClickListener(View.OnClickListener {
            finish()
        })
    }
}
