package com.chr.controllers;

import com.chr.dto.Image;
import com.chr.dto.Message;
import com.chr.services.ComunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/community")
public class PostController {
    @Autowired
    private ComunityService communityService;
    @GetMapping("/messages")
    public ResponseEntity<List<Message>> getCommunityMessages(@RequestParam(value = "page", defaultValue = "0" ) int page){
        return ResponseEntity.ok(communityService.getCommunityMessages(1));
    }

    @GetMapping("/images")
    public ResponseEntity<List<Image>> getCommunityImages(@RequestParam(value = "page", defaultValue = "0" ) int page){
        return ResponseEntity.ok(communityService.getCommunityImage(0));
    }

    @PostMapping("/message")
    public ResponseEntity<Message> postMessage(@RequestBody Message message){
        return ResponseEntity.created(URI.create("v1/community/messages")).body(communityService.postMessage(message));
    }

    @PostMapping("/images")
    public ResponseEntity<Image> postImages(@RequestParam MultipartFile file, @RequestParam(value = "title") String title){
        return ResponseEntity.ok(communityService.postImage(file,title));
    }
}
