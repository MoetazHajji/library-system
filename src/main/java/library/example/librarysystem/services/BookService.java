package library.example.librarysystem.services;

import library.example.librarysystem.entities.Book;
import library.example.librarysystem.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository ;

    public Book addBook(Book book){
        System.out.println(book.getAuthor());
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> getAllBooksByTitle(String title) {
        return bookRepository.getBookByTitle(title);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
