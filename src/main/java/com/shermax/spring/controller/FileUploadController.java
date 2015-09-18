package com.shermax.spring.controller;

import com.shermax.dto.SimpleResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by Sherzod on 9/18/2015.
 */
@RestController
public class FileUploadController {

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    SimpleResult businessUpload(@RequestBody MultipartFile file) {
        Integer fileSize = 0;
        try {
            fileSize = file.getInputStream().available();
            System.out.println("AVAILABLE_BYTES:" + fileSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new SimpleResult("SUCCESS", "File size on server is " + fileSize + " byte(s)");
    }
}
