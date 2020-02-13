package org.aisha.applicationboubyan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_transfer_2.*

class transfer_Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transfer_2)

        toolbarTransfer2.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)

        toolbarTransfer2.setNavigationOnClickListener(View.OnClickListener {
            finish()
        })
    }
}
