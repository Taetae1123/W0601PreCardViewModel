package kr.ac.kumoh.s20200085.w0601precardviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class CardViewModel: ViewModel() {
    private var _cards = MutableLiveData<IntArray>()
    val cards: LiveData<IntArray>
        get() = _cards

    val random = Random(System.currentTimeMillis())

    fun deal() {
        var c =  IntArray(5)
        c[0] = random.nextInt(52)
        c[1] = random.nextInt(52)
        c[2] = random.nextInt(52)
        c[3] = random.nextInt(52)
        c[4] = random.nextInt(52)
        //for(i in 0 until c.size)
        //   c[0] = random.nextInt(52)

        _cards.value = c
    }
}