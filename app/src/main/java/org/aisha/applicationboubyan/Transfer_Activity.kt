package org.aisha.applicationboubyan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_transfer.*
import org.aisha.applicationboubyan.R

class Transfer_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_transfer)

        toolbarTransfer.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)

        toolbarTransfer.setNavigationOnClickListener(View.OnClickListener {
            finish()
        })

        transferbtn.setOnClickListener {
                v: View? -> setContentView(R.layout.activity_transfer_2)  }



        paymebtn.setOnClickListener {
                v: View? -> setContentView(R.layout.activity_payment_)  }


    }
}
