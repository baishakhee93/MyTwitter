package com.mytwitter.com

class  Ticket{
    var tweetID:String?=null
    var tweetText:String?=null
    var tweetImageURL:String?=null
    var tweetPersonUID:String?=null
    var tweetDate:String?=null
    constructor(tweetID:String,tweetText:String,tweetImageURL:String,tweetPersonUID:String){
        this.tweetID=tweetID
        this.tweetText=tweetText
        this.tweetImageURL=tweetImageURL
        this.tweetPersonUID=tweetPersonUID
        this.tweetDate=tweetDate
    }
}