package com.soo.a20200102_practice_pizzaoderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.soo.a20200102_practice_pizzaoderapp.datas.PizzaStore
import kotlinx.android.synthetic.main.activity_pizza_store_detail.*

class PizzaStoreDetailActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_store_detail)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

    }

    override fun setValues() {

        val store = intent.getSerializableExtra("store") as PizzaStore

        storeNameTxt.text = store.storeName
        storePhoneTxt.text = store.phoneNum

        Glide.with(mContext).load(store.logoUrl).into(storeLogoImg)

    }

}
