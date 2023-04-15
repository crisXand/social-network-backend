package com.chr.services;

import com.chr.dto.Image;
import com.chr.dto.Message;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

@Service
public class ComunityService {

    public List<Message> getCommunityMessages(int page){
        return Arrays.asList(new Message(1L,"m1"), new Message(2L,"m2"));
    }

    public List<Image> getCommunityImage(int page){
        return Arrays.asList(new Image(1L,"image1",null), new Image(2L,"image2",null));
    }

    public Message postMessage(Message message){
        return new Message(3L, message.getContent());
    }

    public Image postImage(MultipartFile file, String title){
        return new Image(3L,title,null);
    }
}
