package com.example.project_2_recyclerview_app.data

import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Kids

class Datasource {
    fun loadKids() : List<Kids>{
        return listOf(
            Kids(R.string.member1, R.drawable.han_jisung),
            Kids(R.string.member2, R.drawable.lee_know),
            Kids(R.string.member3, R.drawable.bangchan),
            Kids(R.string.member4, R.drawable.changbin),
            Kids(R.string.member5, R.drawable.seungmin),
            Kids(R.string.member6, R.drawable.feilx),
            Kids(R.string.member7, R.drawable.hyunjin)

        )
    }
}