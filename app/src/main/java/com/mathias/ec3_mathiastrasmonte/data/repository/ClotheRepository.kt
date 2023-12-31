package com.mathias.ec3_mathiastrasmonte.data.repository

import com.mathias.ec3_mathiastrasmonte.data.response.ApiResponse
import com.mathias.ec3_mathiastrasmonte.data.response.ClotheListResponse
import com.mathias.ec3_mathiastrasmonte.data.retrofit.ServiceInstance
import com.mathias.ec3_mathiastrasmonte.model.Clothe
import java.lang.Exception

class ClotheRepository {
    suspend fun getClothes():ApiResponse<List<Clothe>?>{
        return try{
            val response = ServiceInstance.getClotheService().getClothes()
            ApiResponse.Success(response)
        }catch (e: Exception){
            ApiResponse.Error(e)
        }
    }
}