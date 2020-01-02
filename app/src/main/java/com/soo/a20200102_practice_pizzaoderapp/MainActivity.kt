package com.soo.a20200102_practice_pizzaoderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.soo.a20200102_practice_pizzaoderapp.datas.PizzaStore

class MainActivity : BaseActivity() {

    var pizzaStoreList = ArrayList<PizzaStore>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {


    }

    override fun setValues() {
        addPizzaStores()
    }

    fun addPizzaStores() {
        pizzaStoreList.add(PizzaStore("피자헛", "010-123-4567", "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"))    }

}
