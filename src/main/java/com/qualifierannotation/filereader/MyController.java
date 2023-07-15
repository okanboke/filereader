package com.qualifierannotation.filereader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {


    /*
    IoC Container inerisinde bulunan intecj edilebilecek nesneler
    pdfFileReader
    excelFileReader
    getWordFileReader
    @Primary anotasyonunu herhangi bir class'a yazarsak -
    Qualifier anotasyonunu kullanmadan birincil olarak belirleyebiliriz.
     */

    @Autowired
    @Qualifier("PDF") //iki sınıf IoC içerisinde olduğu için Qualifier
    // anotasyonu ile hangi sınıfı çalıştıracağını yazıyoruz.
    private Reader reader;

    @GetMapping("/read")
    public String read() {
       return this.reader.readFile();
    }
}
