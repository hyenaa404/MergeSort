
package controller;

import java.util.ArrayList;
import java.util.Arrays;
import model.Book;
import model.BookList;

/**
 *
 * @author nhs
 */
public class Controller {
    public static void main(String[] args) {
        BookList bl = new BookList();
        bl.readFile("books.csv");
        ArrayList<Book> bll = bl.getBookList();
        Book [] bookArray = bll.toArray(new Book[0]);
        MergeSort<Book> mergeSort = new MergeSort<>(bookArray);
        mergeSort.sort();
        ArrayList<Book> sortedList = new ArrayList<>();
        Book[] sortedArray = mergeSort.getSortedArray();
        sortedList.addAll(Arrays.asList(sortedArray));
        bl.setBookList(sortedList);
        bl.writeFile("sorted_book.csv");
    }
}
