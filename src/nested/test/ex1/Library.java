package nested.test.ex1;

public class Library {

    private Book[] books;

    private int bookCount;


    public Library(int size) {
        books = new Book[size];
        bookCount = 0;

    }

    public void addBook(String title,String author){
        if(bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        } else {
            System.out.println("저장 공간이 부족합니다.");
        }


    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for(int i=0; i<bookCount; i++){
            Book book = books[i];
            //안의 클래스는 바깥으로도 안으로도 접근 가능하다!
            System.out.println("도서 제목: "+book.title+" 저자: "+book.author);
        }

    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
