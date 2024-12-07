package library.example.librarysystem.controllers;

import library.example.librarysystem.entities.Book;
import library.example.librarysystem.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService = new BookService();

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        System.out.println(book);
        return bookService.addBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/search")
    public List<Book> searchByTitle(@RequestParam String title) {
        return bookService.getAllBooksByTitle(title);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
