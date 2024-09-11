package com.example.flappybobayt

import com.example.flappy.AppConstants

class Bird {
    private var birdX: Int = 0
    private var birdY: Int = 0
    private var velocity: Int = 0
    private var currentFrame: Int = 0
    companion object {
        var maxFrame: Int = 0
    }

    init {
        birdX = AppConstants.SCREEN_WIDTH / 2 - AppConstants.bitmapBank.getBobaWidth() / 2
        birdY = AppConstants.SCREEN_HEIGHT / 2 - AppConstants.bitmapBank.getBobaHeight() / 2
        currentFrame = 0
        maxFrame = 0
        velocity = 0
    }

    //get velocity
    fun getVelocity(): Int {
        return velocity
    }

    // set velocity
    fun setVelocity(velocity: Int) {
        this.velocity = velocity
    }

    // getter for current frame
    fun getCurrentFrame(): Int {
        return currentFrame
    }

    // set current frame
    fun setCurrentFrame(currentFrame: Int) {
        this.currentFrame = currentFrame
    }

    // get x coord of boba
    fun getX(): Int {
        return birdX
    }

    // get y coord of boba
    fun getY(): Int {
        return birdY
    }

    // set x coord of boba
    fun setX(bobaX: Int) {
        this.birdX = birdX
    }

    // set y coord of boba
    fun setY(bobaY: Int) {
        this.birdY = birdY
    }
}