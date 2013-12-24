package com.ghtn.service;

import com.ghtn.model.oracle.Book;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-4
 * Time: 下午3:44
 * To change this template use File | Settings | File Templates.
 */
public interface BookManager extends GenericManager<Book, Long> {
    Book saveBookOracleDataSource3(Book book);

    Book saveBookOracleDataSource4(Book book);
}
