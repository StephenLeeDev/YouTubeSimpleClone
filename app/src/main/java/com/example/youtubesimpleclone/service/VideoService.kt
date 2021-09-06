package com.example.youtubesimpleclone.service

import com.example.youtubesimpleclone.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/948287d4-9773-4f97-9510-f326d10f6456")
    fun listVideos(): Call<VideoDto>
}