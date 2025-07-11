package com.example.shoppinglist.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    suspend fun editItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}