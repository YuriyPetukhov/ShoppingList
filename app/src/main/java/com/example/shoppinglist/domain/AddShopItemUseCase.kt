package com.example.shoppinglist.domain

import android.os.Build.VERSION_CODES.S

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addItem(shopItem: ShopItem) {
        shopListRepository.addItem(shopItem)
    }
}