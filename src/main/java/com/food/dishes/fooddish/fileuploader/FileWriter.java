package com.food.dishes.fooddish.fileuploader;

import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;

public class FileWriter {

    private FileOutputStream fos;
    public void writeFile(MultipartFile file, String path, String fileName) {

        try {
            byte fileData[] = file.getBytes();
            fos = new FileOutputStream(path + "\\" + fileName);
            fos.write(fileData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {

                }
            }
        }
    }
}
