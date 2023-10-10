package ie.atu.labweek3;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@AllArgsConstructor
public class LibraryController {

    LibraryService libraryService;

    @GetMapping("/book")

    public ArrayList<Book> getBook(){
        return libraryService.retrieve();
    }
    @PostMapping
    public void addBook (Book book1){
        libraryService.add(book1);

    }
}
