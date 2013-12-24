package com.ghtn.service;

import com.ghtn.BaseTestCase;
import com.ghtn.model.oracle.Book;
import org.junit.Test;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-4
 * Time: 下午4:01
 * To change this template use File | Settings | File Templates.
 */
@Component
public class BookManagerTest extends BaseTestCase {

    private BookManager bookManager;

    @Resource
    public void setBookManager(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    @Test
    public void testSave() {
        Book book = new Book();
        book.setName("book1");
        book.setContent("cotent1");
        bookManager.saveBookOracleDataSource3(book);

        book.setName("book2");
        book.setContent("cotent2");
        bookManager.saveBookOracleDataSource4(book);
    }
}
