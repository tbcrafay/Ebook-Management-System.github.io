
package com.DAO;

import com.entity.BookDtls;
import java.util.List;

/**
 *
 * @author Abdul Rafay
 */
public interface BookDAO {
    
    public boolean addBooks(BookDtls b);
    
    public List<BookDtls> getAllBooks();
    
    public BookDtls getBookById(int id);
    
}