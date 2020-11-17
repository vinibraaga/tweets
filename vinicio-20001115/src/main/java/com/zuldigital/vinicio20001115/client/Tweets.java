package com.zuldigital.vinicio20001115.client;

import com.zuldigital.vinicio20001115.model.Auth;
import com.zuldigital.vinicio20001115.model.Tweet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "herokuapp", url = "https://n8e480hh63o547stou3ycz5lwz0958.herokuapp.com")
public interface Tweets {

    @PostMapping("/{version}/auth")
    Auth postToken(@PathVariable String version);

    @GetMapping("/{version}/statuses/home_timeline.json")
    Tweet getTweet(@PathVariable String version);

}