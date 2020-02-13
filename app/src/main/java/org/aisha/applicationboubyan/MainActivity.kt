package org.aisha.applicationboubyan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_transfer.*
import org.aisha.applicationboubyan.Adapters.AdapterPayments
import org.aisha.applicationboubyan.model.payments

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        toolbarTransfer.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)
//
//        toolbarTransfer.setNavigationOnClickListener(View.OnClickListener {
//            finish()
//        })


        var queue = Volley.newRequestQueue(this)

        var url =""


        var listOFData= ArrayList<payments>()

        var userRequest =
            StringRequest(Request.Method.GET, url, Response.Listener<String> { response ->
                //response code is here
                var Article = Gson().fromJson<ArrayList<payments>>(response, object: TypeToken<ArrayList<payments>>(){}.type)
//                            Toast.makeText(this, Article[1].title, Toast.LENGTH_LONG).show()

                listOFData.add(payments("Zain","20.000KWD","imgStr"))

               // listViewPayments.adapter= AdapterPayments(listOFData,this)

            }, Response.ErrorListener {
                fun onErrorResponse(error:VerifyError?){
                    println(error)
                }
            })
        queue?.add(userRequest)


    }

    fun btntrans(v: View) {

        //val intent = Intent(this,R.layout.activity_main_transfer::class.java)
        val view =  setContentView(R.layout.activity_main_transfer)


    }
}
