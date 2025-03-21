package com.example.shoppinglist.domain

interface ShopListRepository {
    fun addItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editItem(shopItem: ShopItem)
    fun getShopItem(shopItemId: Int): ShopItem
    fun getShopList(): List<ShopItem>
}