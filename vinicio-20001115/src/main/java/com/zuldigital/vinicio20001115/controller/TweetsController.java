package com.zuldigital.vinicio20001115.controller;


import com.zuldigital.vinicio20001115.client.Tweets;
import com.zuldigital.vinicio20001115.model.Auth;
import com.zuldigital.vinicio20001115.model.Tweet;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/consultas")
public class TweetsController {


    @Autowired
    private Tweets tweets;

    @PostMapping("/{version}/token")
    public ResponseEntity Token(@PathVariable String version) {
        Auth token = tweets.postToken(version);
        return ResponseEntity.ok(token);
    }

    @GetMapping("/{version}/tweet")
    public ResponseEntity tweet(@PathVariable String version , @RequestHeader("token") HttpHeaders headers)  {
        Tweet tweet = tweets.getTweet(version);
        return new ResponseEntity(tweet, HttpStatus.OK);
    }

}
