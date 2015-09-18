package com.shermax.jersey;

import com.shermax.dto.SimpleResult;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Sherzod on 9/18/2015.
 */
@Path("/")
public class FileUploadResource {

    @POST
    @Path("/upload")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public SimpleResult categoryImageUpload(
            @FormDataParam("file") InputStream file,
            @FormDataParam("file") FormDataBodyPart bodyPart) {

        Integer fileSize = 0;
        try {
            fileSize = file.available();
            System.out.println("AVAILABLE_BYTES:" + fileSize);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new SimpleResult("SUCCESS", "File size on server is " + fileSize + " byte(s)");
    }
}
