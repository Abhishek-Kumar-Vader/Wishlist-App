package com.example.wishlistapp.data

import kotlinx.coroutines.flow.Flow

class WishRepository(private val wishDao: WishDao) {
    suspend fun addAWish(wish: Wish){
        wishDao.addAWish(wish)
    }
    fun getWishes(): Flow<List<Wish>> = wishDao.getAllWishes()
    fun getWisheesById(id:Long):Flow<Wish>{
        return wishDao.getAWishById(id)
    }
    suspend fun updateWish(wish: Wish){
        wishDao.updateAWish(wish)
    }
    suspend fun deleteWish(wish: Wish){
        wishDao.deleteAWish(wish)
    }
}
