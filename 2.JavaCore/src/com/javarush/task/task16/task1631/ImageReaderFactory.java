package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes s) {

        try {
            if (s ==ImageTypes.JPG)
                return new JpgReader();
            else if (s == ImageTypes.BMP)
                return new BmpReader();
            else if (s == ImageTypes.PNG)
                return new PngReader();
            else {
                throw new IllegalArgumentException("Неизвестный тип картинки");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
